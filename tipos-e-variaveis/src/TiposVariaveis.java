public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com zero, use String (ex: "021070333")
        long cpf = 98765432109L; // "L" indica que é um literal long (se começar com zero, use String)
        float pi = 3.14F; // "F" indica que é um literal float
        double salario = 1275.33;

        final double VALOR_DE_PI = 3.14;

        System.err.println(VALOR_DE_PI);

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);

    }
}

/*
 * int
 * byte
 * short
 * long
 * float
 * double
 * char
 */