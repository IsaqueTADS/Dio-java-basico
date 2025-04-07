public class Operadores {

  public static void main(String[] args) {

    /*
     * para objeto é necessario usar equals
     */

    String nome = "Isaque";
    String nome2 = new String("Isaque");

    System.err.println(nome == nome2);
    System.err.println(nome.equals(nome2));

  }

}
