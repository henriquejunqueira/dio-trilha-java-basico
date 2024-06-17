public class Operadores {

    public static void main (String[] args){
        //String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.println(nomeCompleto);

        //String concatenacao = "?";

        //concatenacao = 1 + 1 + 1 + "1";
        //System.out.println(concatenacao);

        //concatenacao = 1 + "1" + 1 + 1;
        //System.out.println(concatenacao);

        //concatenacao = 1 + "1" +1+ "1";
        //System.out.println(concatenacao);

        //concatenacao = "1" + 1 + 1 + 1;
        //System.out.println(concatenacao);

        //concatenacao = "1" + (1 + 1 + 1);
        //System.out.println(concatenacao);

        //int numero = 5;

        //numero = - numero; // torna o número negativo

        //System.out.println(- numero);
        //System.out.println(numero);

        //numero = numero * -1; // torna o número positivo
        //System.out.println(numero);

        //int numero = 5;
        // x repeticao
        //numero = numero + 2;
        //numero = numero + 1;
        //numero = numero + 1;
        //numero++;

        //System.out.println(numero);
        //System.out.println(numero++);
        //System.out.println(++numero);
        //System.out.println(numero--);
        //System.out.println(numero);

        //boolean variavel = true;

        //System.out.println(!variavel);

        //variavel = !variavel;
        //System.out.println(variavel);

        //int a, b;

        //a = 6;
        //b = 6;

        //String resultado = "";

        /*if(a==b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso";
        }*/

        //String resultado = a == b ? "verdadeiro" : "falso";
        //int resultado = a == b ? 1 : 0;

        //System.out.println(resultado);

        //String nomeUm = "HENRIQUE";
        //String nomeDois = "HENRIQUE";
        //String nomeDois = new String("HENRIQUE");

        //System.out.println(nomeUm == nomeDois);
        //System.out.println(nomeUm.equals(nomeDois));

        //int numero1 = 1;
        //int numero2 = 2;

        //boolean simNao = numero1 == numero2;

        /*if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }*/

        /*if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira");
        }*/

        //System.out.println("numeroUm é igual a númeroDois? " + simNao);

        //simNao = numero1 != numero2;

        //System.out.println("numeroUm é diferente de númeroDois? " + simNao);

        //simNao = numero1 > numero2;

        //System.out.println("numeroUm é maior que númeroDois? " + simNao);

        boolean condicao1 = true;
        //boolean condicao2 = false;
        boolean condicao2 = true;

        /*if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }*/

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }
}
