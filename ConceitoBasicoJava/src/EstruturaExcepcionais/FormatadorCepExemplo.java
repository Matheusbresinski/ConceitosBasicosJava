package EstruturaExcepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
//            String cepFormatado = formatarCep("23582518");
            String cepFormatado = formatarCep("3582518");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
//            throw new RuntimeException(e);
            System.out.println("O cep não corresponde com as regras de negócio");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException
    {
        if (cep.length() != 8 )
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }

}
