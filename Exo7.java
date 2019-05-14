import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int a = sc.nextInt();

        System.out.println("Saisissez un entier : ");
        int b = sc.nextInt();

        int tmp = a;
        a = b;
        b= tmp;
        System.out.println("a = "+ a );
        System.out.println("b = "+ b );
    }
}