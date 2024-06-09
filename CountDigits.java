import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        //getting input number
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scan.nextInt();

        int count=0;
        int n=num;
        while(n!=0){
            n= n/10;
            count= count+1;
        }
        System.out.println("The number of digits in "+ num+ " is "+ count);
    }
}
