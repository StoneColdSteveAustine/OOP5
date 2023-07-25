import Calculus.Calc_block;
import Logger.result_logger;
import Transform;
import Console;

public class Main {
    public static void main(String[] args) {
        button_click();
    }

    public static void button_click() {
        String j = data_transformation.data_formatting(Console.input_data());
        Calc_block calc_result = new Calc_block(j);
        Console.view_data(calc_result, "Ответ:");
        result_logger.write_log(j, calc_result);
    }
}
