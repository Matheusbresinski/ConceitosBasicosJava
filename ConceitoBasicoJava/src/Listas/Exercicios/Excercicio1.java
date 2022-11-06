package Listas.Exercicios;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Excercicio1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;

        while (true)
        {
            if (count == 6) break;
            System.out.println("Digite a temperatura");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }

        System.out.println("---------------------------------------------------");

        //Exibindo todas as temperaturas
        System.out.println("Todas as temperaturas");
        temperaturas.forEach(t -> System.out.println(t + " "));


        //calculando e exibindo a média das temperaturas
        double media = temperaturas.stream()
                                   .mapToDouble(Double::doubleValue)
                                   .average()
                                   .orElse(0d);

        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        //Exibindo as temperaturas acima da média.
        System.out.print("Temperaturas acima da média ");
        temperaturas.stream()
                    .filter(t -> t > media)
                    .forEach(t -> System.out.printf("%.1f", t));

        // Exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator =  temperaturas.iterator();

        count = 0;

        while (iterator.hasNext())
        {
            Double temp = iterator.next();
            if (temp > media)
            {
                switch (count)
                {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                    break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                    break;
                    case (3):
                        System.out.printf("2 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("2 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("2 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média");
                }
            }
            count++;
        }

    }
}
