public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String CepFormatado = formatarCep("12345678");
            System.out.println(CepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP não localizado, verifique novamente");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
        throw new CepInvalidoException();

        return "23.765-064";
    }
}
