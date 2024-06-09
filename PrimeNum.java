import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {

        //receiving range of numbers to find prime numbers as input
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number limit to find prime numbers in it: ");
        int numRange = obj.nextInt();

        System.out.println("The prime numbers in the range " + numRange + " are: ");

        for(int i=2; i<=numRange; i++){
            int flag=0;
            for(int j=2; j<i; j++){ //loop to check remainders of all numbers lesser than i
                if(i%j==0){
                    flag=1;
                    break;//even if i is divisible by only 1 number, it's not prime
                }
            }
            if(flag!=1){//if i is not divisible by any num less than itself, its a prime
                System.out.print(i+ " ");
            }

        }

    }
}