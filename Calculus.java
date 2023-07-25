import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Object[] data = {left_value, oper, right_value};
        System.out.println(calc_block(data));
    }

    public static Object calc_block(Object[] data) {
        Object left_value = data[0];
        Object oper = data[1];
        Object right_value = data[2];

        if (oper.equals("+")) {
            return sum(left_value, right_value);
        }
        if (oper.equals("-")) {
            return sub(left_value, right_value);
        }
        if (oper.equals("*")) {
            return mult(left_value, right_value);
        }
        if (oper.equals("/") && !right_value.equals(0)) {
            return div(left_value, right_value);
        } else {
            return "На 0 делить нельзя!";
        }
    }

    public static Object sum(Object left_value, Object right_value) {
        if (left_value instanceof Number && right_value instanceof Number) {
            return ((Number) left_value).doubleValue() + ((Number) right_value).doubleValue();
        } else {
            return null;
        }
    }

    public static Object sub(Object left_value, Object right_value) {
        if (left_value instanceof Number && right_value instanceof Number) {
            return ((Number) left_value).doubleValue() - ((Number) right_value).doubleValue();
        } else {
            return null;
        }
    }

    public static Object mult(Object left_value, Object right_value) {
        if (left_value instanceof Number && right_value instanceof Number) {
            return ((Number) left_value).doubleValue() * ((Number) right_value).doubleValue();
        } else {
            return null;
        }
    }

    public static Object div(Object left_value, Object right_value) {
        if (left_value instanceof Number && right_value instanceof Number) {
            return ((Number) left_value).doubleValue() / ((Number) right_value).doubleValue();
        } else {
            return null;
        }
    }
}
