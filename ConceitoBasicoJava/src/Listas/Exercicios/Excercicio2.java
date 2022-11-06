package Listas.Exercicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Excercicio2 {
/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

    public static void main(String[] args)
    {
        List<Boolean> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("------------Peguntas------------ ");
        System.out.println("favor responder sim ou não!");
        System.out.println("Telefonou para a vítima?");
        String resposta = scan.next().toLowerCase();
        respostas.add(RetornarVerdadeiroOuFalso(resposta));
        System.out.println("Esteve no local do crime?");
        resposta = scan.next().toLowerCase();
        respostas.add(RetornarVerdadeiroOuFalso(resposta));
        System.out.println("Mora perto da vítima?");
        resposta = scan.next().toLowerCase();
        respostas.add(RetornarVerdadeiroOuFalso(resposta));
        System.out.println("Devia para a vítima?");
        resposta = scan.next().toLowerCase();
        respostas.add(RetornarVerdadeiroOuFalso(resposta));
        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.next().toLowerCase();
        respostas.add(RetornarVerdadeiroOuFalso(resposta));

        System.out.println(respostas);

        int count = 0;
        Iterator<Boolean> contador = respostas.iterator();
        while(contador.hasNext()){
            boolean resp = contador.next();
            if(resp) {
                count ++;
            }
        }

        String resultado = ResultadoDoCrime(count);
        System.out.println(resultado);


    }
    public static boolean RetornarVerdadeiroOuFalso(String resposta)
    {
        boolean resultado = false;
        switch (resposta)
        {
            case "sim":
                resultado = true;
                break;
            case "não":
                resultado = false;
                break;
            default:
                System.out.println("favor responder sim ou não!");
        }
        return resultado;
    }

    public static String ResultadoDoCrime(int tipoClassificacao) {
        switch (tipoClassificacao)
        {
            case 1:
            case 2:
                return "Suspeita";
            case 3:
            case 4:
                return "Cúmplice";
            case 5:
                return "Assassina";
            default:
                return "Inocente";
        }

    }
}
