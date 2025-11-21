public class Operadores {
    public static void main(String[] args) {
        // Operadores Unários 
        int numero = 5;
        System.out.println(- numero);
        
        numero = -5;
        System.out.println(+ numero);

        System.out.println(numero * -1);

        // Operadores Binários e de incrementação

        numero = 3;

        System.out.println(++numero);
        
        System.out.println(--numero);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;
        
        System.out.println(variavel);

        // Operadores ternários

        int a = 30;
        int b = 22;

        boolean resutado = a < b ? true : false;
        System.out.println("Essa expressão é :" + resutado);
    }
}
