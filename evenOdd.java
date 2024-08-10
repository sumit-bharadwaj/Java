import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number");
        int num1 = input.nextInt();
        
        String result = num1 % 2 == 0 ? "EVEN" : "ODD" ;
        System.out.println("your number is "+ result );
        
        }

    }
    
