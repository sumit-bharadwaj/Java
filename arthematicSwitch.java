import java.util.Scanner;

class arthematicSwitch{
    private static final String addition = "addition";
    private static final String subtraction = "subtraction";
    private static final String multiplication = "multiplication";
    private static final String division = "division";
    private static final String modulus = "modulus";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter operation addition,subtraction,multiplication,division,modulus");
        String arithematic = input.nextLine();
        System.out.println("enter num1");
        int num1 = input.nextInt();
        System.out.println("enter num2");
        int num2 = input.nextInt();
        int c;
        switch (arithematic) {
            case  addition:
            c= num1+num2;
            System.out.println("your answer"+ c);
            break;

            case  subtraction:
            c=num1-num2;
            System.out.println("your answer" + c );
            break;

            case multiplication:
            c=num1*num2;
            System.out.println("your answer"+ c);
            break;

            case division:
            c=num1/num2;
            System.out.println("your answer"+ c);
            break;

            case modulus:
            c=num1%num2;
            System.out.println("your answer"+ c);
            break;
            

        }

    }
}