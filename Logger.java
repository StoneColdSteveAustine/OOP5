import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        resultLogger(new Object[]{5, "+", 3}, 8);
    }

    public static void resultLogger(Object[] data, int result) {
        int leftValue = (int) data[0];
        String oper = (String) data[1];
        int rightValue = (int) data[2];
        String dataStr = leftValue + " " + oper + " " + rightValue;
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

        try {
            FileWriter fileWriter = new FileWriter("log.csv", true);
            fileWriter.write(time + "; операция : " + dataStr + " результат :" + result + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
