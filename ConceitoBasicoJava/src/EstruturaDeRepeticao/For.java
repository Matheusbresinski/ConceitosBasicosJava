package EstruturaDeRepeticao;
/*
    laço de repetição, também conhecidos como laços de iteração ou simplesmente loops, são
    comandos que permitem iteração de código, ou seja , que comandos resentes no bloco sejam
    repetidos diversas vezes

 For - O comando For( na tradução literal para a língua portuguesa "para") permite que uma variável contadora seja
 testada e incrementada a cada iteraação, sendo essas informações definidas na chama do comando. O comando for recebe
 como entrada uma variável contadora, a condição e o valor de incrementação


    Estrutura do controle de fluxo fr

    for( bloco de inicialzação; expressão booleana de validação; bloco de atualização ou incrementação)
    {
        comando que será executado até que a expressão de validação torne-se falsa
    }
 */
public class For {

    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++ )
        {
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
        System.out.println("Andrea Dormiu");
    }
}
