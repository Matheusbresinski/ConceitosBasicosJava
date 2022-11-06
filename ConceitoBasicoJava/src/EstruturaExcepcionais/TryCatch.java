package EstruturaExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
*   Exceçãoes
*       Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador
*       erros devido a entrada errada ou outros imprevistos
*
*       Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é:
* Java lançará uma exceção(jogará um erro)
*
* De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drastivamente.
* já exceções é um fluxo inesperado da nossa aplicação por exemplo: Querer dividir um valor por zero, quere abrir um
* arquivo que não existe,a brir uma conexão de banco com usuário ou senha inválida todos esses cenários e os demais
* não são erros mas sim fluxos não previstos pela aplicação.
*
*   É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o
* que denominamos de Tratamento de Exceções
*
*   Mão na massa
*
*
* */
public class TryCatch {
    public static void main(String[] args) {
        //Criando um objeto scanner
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();


            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
