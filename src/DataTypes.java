import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
        //целые:
        byte b; // 1b = 8 bit 2 ^ 8 = 256 -> [-128; 128)
        //01111111 = 127
        short s; // 2b = 16 bit 2 ^ 16
        int i; // 4b = 32 bit 2 ^ 32 [
        long l; // 8b = 64 bit
        BigInteger v; // infinity Length
    // арифметика
        // + - * / % >> <<
        // ++, --, +=, *=, /=, %= ...
        // / - деление нацело
        // % - остаток от деления
        int a = 7;
        System.out.println(--a);
        System.out.println(a);
        a = a++ + ++a;
        System.out.println(a);
        a *= 2; // a = a * 2
        System.out.println(a);
        a = a-- - --a;
        System.out.println(a);
        System.out.println(5 / 3); // 5 / 3 = 1 2/3
        System.out.println(5 % 3);
        //дробные
        float f; // 4b
        double d = 1 / 0.; // 8b 10 ^ 16 точность + 10 ^ 30
        double e = 1 / 0.;
        double ds1 = 1 / 3.;
        System.out.printf("%.25f\n", ds1);
        System.out.println(d);
        System.out.println(e);
        System.out.println(ds1);
        System.out.println(e / ds1);
        System.out.println(d / e);
        boolean b1 = false || false; // 0 0
        boolean b2 = false || true; // 0 1
        boolean b3 = true || false; // 1 0
        boolean b4 = false && true; // 0 1
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        //|| или , && - и
    char ch = 'a';
    System.out.println('a');
    }
}
