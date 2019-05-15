class ErreursMethodes {

  public static void main (String[] args) {
      int i1 = methode1();
      int i2 = methode2();
      int i3 = methode3();
      int i4 = methode4();
      methode5();
      methode6();
      methode7();
      methode8();
  }
  //il manque les parenthèses de la méthode1 ()
  static int methode1 {
      int a = 0;
      System.out.println("Méthode 1");
      return a;
  }
  // il manque le type de la variable i1
  static int methode2 () {
      int a = 0;
      i1 = 10;
      System.out.println("Méthode 2");
      return a;
  }
  //  il manque un return de type int
  static int methode3 () {
      int a = 0;
      System.out.println("Méthode 3");
  }
  // erreur de type : La methode est de type int et retourne un String
  static int methode4 () {
      String a = "0";
      System.out.println("Méthode 4");
      return a;
  }
  /*La méthode ne doit retourner aucunes valeurs
   donc pas besoin de return */
  static void methode5 () {
      double a = 0;
      System.out.println("Méthode 5");
      return a;
  }
  //il manque la déclaration du type de retour de la méthode
  static methode6 () {
      double a = 0;
      System.out.println("Méthode 6");
      return a;
  }
  /*la methodeSansErreur()
   attend 2 paramètres et pas seulement 1 seul*/
  static void methode7 () {
      int a = 0;
      double b = 5.5;
      methodeSansErreur(a);
      System.out.println("Méthode 7");
  }
  /*la methodeSansErreur attend en paramètre
  un int et un double. b est un String*/
  static void methode8 () {
      int a = 0;
      String b = "5.5";
      methodeSansErreur(a, b);
      System.out.println("Méthode 8");
  }

  static void methodeSansErreur (int a, double b) {
      // Cette méthode ne fait rien du tout
  }
}