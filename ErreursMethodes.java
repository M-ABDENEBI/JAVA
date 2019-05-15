import java.util.Scanner;

public class Exo1 {

  public static void main(String[] args) {
    Scanner s;
    String n;
    do{
      s = new Scanner(System.in);
      System.out.print("Entrer un nombre:");
      n = s.nextLine();
      if("exit".equals(n)){
        System.out.println("il a écrit " + n);
      }     
      try {
        if(!"exit".equals(n)){
          int result = Integer.parseInt(n);
          if(result>0){
            System.out.println("le nombre est positif");
          }else{
            if(result<0){
              System.out.println("le nombre est négatif");
            }else{
              System.out.println("le nombre est égal à zero");
            }
          }
          if(result % 2 == 0|| result == 0){
            System.out.println(n+" est un nombre paire");
          }else{
            System.out.println(n+" est impair");
          }
        } 
      }catch (Exception e) {
        System.out.println("il y a une erreur dans la saisie");
      }     
    }while(!"exit".equals(n));
   
  }
}
