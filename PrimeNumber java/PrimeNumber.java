import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prime no check .. please enter no.");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i =2; i<num/2;i++){
            if(num % i == 0){
                isPrime =false;
                break;

            }
        } 


        if(isPrime)
        System.out.println(num+"is a prime no");
        else
        System.out.println(num+"is not a prime no");
        sc.close();
    }
}