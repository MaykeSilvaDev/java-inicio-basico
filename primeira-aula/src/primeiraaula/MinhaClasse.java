package mayke.primeiraaula;
public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Mayke";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
        
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Método é " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
