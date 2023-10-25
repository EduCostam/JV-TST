public class MinhaClasse {
    
/**
 * @param args
 */
public static void main(String[] args) {

    String primeiroNome = "Calvão";
    String segundoNome = "De Cria";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    String nomeCompleto2 = nomeCompleto;
    System.out.println(nomeCompleto2);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}

}
