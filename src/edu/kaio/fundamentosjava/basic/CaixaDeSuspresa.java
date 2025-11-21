import java.util.Random;

public class CaixaDeSuspresa{
    //Quero usar testar o uso de Random no Java
    public static void main(String[] args) {
        // Cria uma instância da classe Random, que é um gerador de números pseudoaleatórios.
        Random random = new Random();

        // Define um array de Strings com as possíveis surpresas que podem ser encontradas.
        String[] surpresas = {"Um vale-presente de R$50", "Um chocolate", "Um livro de Java", "Um par de meias", "Nada :("};

        // O método nextInt(bound) gera um número inteiro aleatório entre 0 (inclusivo) e o valor de 'bound' (exclusivo).
        // Aqui, ele sorteará um índice válido para o nosso array 'surpresas'.
        int indiceSorteado = random.nextInt(surpresas.length);

        // Exibe a surpresa que corresponde ao índice sorteado.
        System.out.println("Você abriu a caixa de surpresa e encontrou: " + surpresas[indiceSorteado]);
        //surpresas é o presente dentro do Array : Ele será associado ao índice aleatório.
    }
}