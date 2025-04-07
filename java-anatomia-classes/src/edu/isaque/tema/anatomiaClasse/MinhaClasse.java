package edu.isaque.tema.anatomiaClasse;
public class MinhaClasse {

  public static void main(String[] args) {

    String nomeCompleto = nomeCompleto("IsaqueTADS", "Rodrigues Alves");

    System.err.println(nomeCompleto);

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }

}
