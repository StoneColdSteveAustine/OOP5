import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        viewData(inputData(scanner), "Data");
    }
    
    public static void viewData(Object data, String title) {
        System.out.println(title + " = " + data);
    }
    
    public static String getValue(Scanner scanner) {
        return scanner.nextLine();
    }
    
    public static Object inputData(Scanner scanner) {
        System.out.println("Для работы с комплексными числами нажмите - 1, Для работы с рациональными числами нажмите - 2");
        String dataType = getValue(scanner);
        String leftValue = "";
        String rightValue = "";
        String oper = "";
        
        if (dataType.equals("1")) {
            System.out.println("Введите первое число (используйте формат: \"5 + 3j\"):");
            leftValue = getValue(scanner);
            System.out.println("Введите второе число (используйте формат: \"5 + 3j\"):");
            rightValue = getValue(scanner);
            System.out.println("Выберите операцию:");
            oper = getValue(scanner);
        } else if (dataType.equals("2")) {
            System.out.println("Введите первое число (используйте формат: \"5/11\"):");
            leftValue = getValue(scanner);
            System.out.println("Введите второе число (используйте формат: \"5/11\"):");
            rightValue = getValue(scanner);
            System.out.println("Выберите операцию:");
            oper = getValue(scanner);
        }
        
        return new Object[] {dataType, leftValue, oper, rightValue};
    }
}
