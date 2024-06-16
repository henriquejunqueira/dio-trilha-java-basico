public class TiposVariaveis {
    public static void main(String[] args) {
        // tipos primitivos
        // estudem a classe String que representa texto na aplicação
        String meuNome = "HENRIQUE JUNQUEIRA";

        // double salarioMinimo = 2.500; // atribuição não será dois mil e quinhentos, e sim dois vírgula cinco
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 10.75;
    }
}