package basic;
public class Main {
    public static void main(String[] args) {
        String primeiroNome = "Fábio";
        String segundoNome = "Kaio";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método".concat(primeiroNome.concat(" ").concat(segundoNome)); // Usando concatenação inbutida na classe String (concat).
    } 
}
