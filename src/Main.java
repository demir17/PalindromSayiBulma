import java.util.Scanner;
public class Main {

    static void isPolindrom(int num){
        int temp = num, reverseNumber= 0, lastNumber;

        while(temp !=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        

        if (num == reverseNumber){
            System.out.println("Bu bir palindrom sayıdır.");
        }
        else {
            System.out.println("Bu bir palindrom sayı değildir.");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,count = 0 ;


        System.out.println("Bir sayı giriniz: ");
        n = sc.nextInt();
        isPolindrom(n);





    }
}
