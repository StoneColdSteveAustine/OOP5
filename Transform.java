import Console as cons;
import java.util.*;
import java.lang.*;
import java.math.*;
import cmath.*;
import Calculus.Calc_block as calc;
import Transform as trans;

public class Main {
    public static void main(String[] args) {
        data_formatting(data);
    }

    public static Object[] data_formatting(Object[] data) {
        String data_type = (String) data[0];
        Object left_value = data[1];
        Object oper = data[2];
        Object right_value = data[3];
        if (data_type.equals("1")) {
            left_value = new Complex(left_value);
            right_value = new Complex(right_value);
        } else if (data_type.equals("2")) {
            String a = (String) left_value;
            left_value = new Fraction(Integer.parseInt(a.substring(0, a.indexOf("/"))), Integer.parseInt(a.substring(a.indexOf("/") + 1)));
            String b = (String) right_value;
            right_value = new Fraction(Integer.parseInt(g.substring(0, g.indexOf("/"))), Integer.parseInt(g.substring(g.indexOf("/") + 1)));
        }
        return new Object[]{left_value, oper, right_value};
    }
}
