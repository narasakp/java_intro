public class Operator {
    public static void main(String[] args) {
        float num1 = 10f;
        int num2 = 20;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num2/num1);

        String msg = "hello";
        System.out.println(num1+msg);

        if (num1 > num2) {
            System.out.println("num1 > num2");
        }
            else {
                System.out.println("num1 < num2");
        }
    }
}