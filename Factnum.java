import java.util.Scanner;
public class Factnum {
    public static void main(String [] args){
        int fact= 1;
        Scanner num= new Scanner(System.in);
        System.out.println("Enter a number to find Factorial: ");

        int factInput= num.nextInt();

        for(int i=1; i<=factInput; i++){
            fact = fact*i;
        }
        System.out.print("The Factorial of "+ factInput+ " is "+fact);

    }
}
