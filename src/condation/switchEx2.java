package condation;

public class switchEx2 {
    public static void main(String[] args) {
        int a = 45;
        int b = 30;
        char op = '*';
        switch (op) {
            case '+':
            System.out.println(a + b);
            break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operater");


        }
    }
}
