public class HomeWork_003_004 {
    static void funcName(int a, int b, int c, int d) {
        System.out.println(a * (b + (c / d)));
        int h;
        h = a + b;
//      System.out.println("a+b="+h);
        boolean flag = true;
        if (h <= 20 && h >= 10 && flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        funcName(9, 12, 4, 2);
    }
}
