package EstruturaExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

/*
*   HERARQUIa das exceções
*
*   A linguagem java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma
*   hierarquia denominadas checked and Unchecked Exceptions ou Exceções Checadas e não checadas.
*
*               Throwable
*           .                .
*       Erro                            Exception
*                       .                    |
*               RuntimeException             |
*                   |                        |
*       NullPointerException                 |
*       NumberFormatException                |
*       ClassCastException               IOException
*      IndexOutOfBoundsException         SQLException
                                    MalformedURLException

 * O que determina um exceçã ser classificado como checada ou não checada?
 *
 * É o risco dela ser disparada logo você precisa tratá-la, exemplo:
 *
 * Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma String para um numero, porem o
 *  texto contém Alfanuméricos
 *
 *
 *  Exceções customizadas
 *
 * Nós podemos criar nosss próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar
 * os recursos desenvolvidos no projeto, exemplo:
 *
 *  imagina que como regra de negócio, para formatar cep necessita sempre de ter 8 dígitos, caso contrário lançará uma
 * exceção que denominamos de CepInvalidoException.
 *
 * Primeiro crimanos nossa exceção
 * */
public class ExcecoesCustomizadas {
    public static void main(String[] args) {

//        Number valor = Double.valueOf("a1.75");

        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
