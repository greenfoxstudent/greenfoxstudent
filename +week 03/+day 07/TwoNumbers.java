package hello;

public class TwoNumbers {
    public static void main(String[] args) {
        System.out.println(22 + 13);
        System.out.println(22 - 13);
        System.out.println(22 * 13);
        simpFrac(22, 13);
        System.out.println(22 / 13);
        remainder();
    }

    public static void simpFrac(int num, int den) {
        // simpFrac(22, 13);
        System.out.println("Result=: " + num + " / " + den);

    }

    public static void remainder()
    {
        int num1, num2, result;
        num1=22;
        num2=13;
        result=num1%num2;
        System.out.println(""+result);
    }
}


