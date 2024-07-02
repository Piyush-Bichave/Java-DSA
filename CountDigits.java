import java.util.*;

class CountDigits { 

    public static int CountDigits(int n){

        int count = 0;

        while(n!=0){
            count++;
            n=n/10;
        }
        return count;

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int numberOfDigits = CountDigits(n);
        System.out.println(numberOfDigits);
    }
}