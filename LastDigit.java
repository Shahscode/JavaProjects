import java.util.*;
public class LastDigit {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= obj.nextInt();
        int last =num%10;
        System.out.println("The last digit of "+ num +" is "+ last);


    }
}
