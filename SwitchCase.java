public class SwitchCase{
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Case 1 value is " + num);
                break;
            case 2:
                System.out.println("Case 2 value is " + num);
                break;
        
            default:
            System.out.println("Other Case is " + num);
                break;
        }
    }
}