import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class algorithm {
    final String PREV_COMMAND = "prev";
    final String NEXT_COMMAND = "next";

    LocalTime videoTime;
    LocalTime currentPos;
    LocalTime opStartPos;
    LocalTime opEndPos;

    private void checkOpenning() {
        if (currentPos.isBefore(opStartPos) || currentPos.compareTo(opEndPos) >= 0) {
            return;
        }  
        
        currentPos = LocalTime.of(0, opEndPos.getMinute(), opEndPos.getSecond());
    }

    private void prev() {
        checkOpenning();

        currentPos = currentPos.minusSeconds(10);

        if (currentPos.getHour() == 23) {
            currentPos = LocalTime.of(0, 0, 0);
        }

        checkOpenning();
    }

    private void next() {
        checkOpenning();

        currentPos = currentPos.plusSeconds(10);

        if (currentPos.isAfter(videoTime)) {
            currentPos = LocalTime.of(0, videoTime.getMinute(), videoTime.getSecond());
        }

        checkOpenning();
    }

    private void insertCommand(String command) {
        switch (command.toLowerCase()) {
            case PREV_COMMAND:
                prev();
                return;
            case NEXT_COMMAND:
                next();
                return;
            default:
                return;
        }
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int[] arr = Arrays.stream(video_len.split(":")).mapToInt(Integer::parseInt).toArray();
        videoTime = LocalTime.of(0, arr[0], arr[1]);

        arr = Arrays.stream(pos.split(":")).mapToInt(Integer::parseInt).toArray();
        currentPos =  LocalTime.of(0, arr[0], arr[1]);

        arr = Arrays.stream(op_start.split(":")).mapToInt(Integer::parseInt).toArray();
        opStartPos =  LocalTime.of(0, arr[0], arr[1]);

        arr = Arrays.stream(op_end.split(":")).mapToInt(Integer::parseInt).toArray();
        opEndPos =  LocalTime.of(0, arr[0], arr[1]);

        Arrays.stream(commands).forEach(cmd -> insertCommand(cmd));

        return currentPos.format(DateTimeFormatter.ofPattern("mm:ss"));
    }
}

public class Solution {
    public static void main(String[] args) {
        algorithm kata = new algorithm();
        System.out.println(kata.solution("34:33", "13:00", "00:55", "02:55", new String [] {"next", "prev"}));
        System.out.println(kata.solution("10:55", "00:05", "00:15", "06:55", new String [] {"prev", "next", "next"}));
        System.out.println(kata.solution("07:22", "04:05", "00:15", "04:07", new String [] {"next"}));
        System.out.println(kata.solution("07:22", "00:05", "00:15", "04:07", new String [] {"prev"}));
    }
}
