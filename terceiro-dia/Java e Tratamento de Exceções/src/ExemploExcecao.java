import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) throws ParseException {
        try {
        Number valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
        } catch (ParseException e) {
            System.out.println("Formato de número inválido: " + e.getMessage());
        }
    }
}
