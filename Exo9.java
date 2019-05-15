import java.util.Scanner;

public class Exo9 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Entrer a");
    double a = input.nextDouble();

    System.out.println("Entrer b");
    double b = input.nextDouble();

    System.out.println("Entrer c");
    double c = input.nextDouble();

    System.out.println("Entrer x");
    System.out.println("utilisez la virgule pour les décimaux");
    double x = input.nextDouble();

    System.out.println("-------");

    double a2 = Math.pow(x, 2);

    double a3 = Math.pow(x, 3);


    double d = a + b;
    double resultat = (d/2)*a3+Math.pow(d, 2)*a2+d+c;
    System.out.print(resultat);
}
}
