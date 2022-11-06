package Listas;


import java.util.*;

public class ListPart1e2 {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//            List notas = new ArrayList();
//            ArrayList<Double> notas = new ArrayList<>();
//            List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
//            List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6);
//            notas.add(10d);
//            System.out.println(notas);
//
//            List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);
//            notas.add(1d);
//            notas.remove(5d);
//            System.out.println(notas);


        System.out.println("Crie uma lista e adicione as sete notas");
        List<Double> notas = new ArrayList<Double>(); // Generics(jdk 5) - diamont Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);//posição e o elemento
        System.out.println(notas);
        notas.set(notas.indexOf(5d), 6.0); //a possição do que você quer atualizar e o valor que deseja mudar
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: "+ notas.contains(5d));//o metodo para saber se tem o elemento dentro da lista é

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
//        for (Double nota : notas)
//            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));// o metodo get pega a nota adicionada em qual posição voce desejar no caso foi digitado 3
        System.out.println("Exiba a meno nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();//interar dentro da lista e somar  - crtl+alt+v para criar uma variável

       Double soma = 0d;
        while (iterator.hasNext())// o intereitor tem o proximo valor? se tiver entra
        {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));// size conta a quantidade de elementos dentro do array

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);///remove a nota ou o elemento => 0
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0");
        notas.remove(0);///remove da posição 0
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);
//
//        System.out.println("Apague toda a lista");
//        notas.clear();
//        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        /*
        * Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        */
        System.out.println("Crie uma lista chamada nota2"+
                "e coloque todos os elementos da list ArrayList nessa nova lista: ");

        LinkedList<Double> notas2 = new LinkedList();
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()){
            Double next = iterator2.next();
            notas2.add(next);
        }
        System.out.println(notas2);
//
        System.out.println("Mostre a primeira nota da nova lista sem removê-la: "+ notas2.get(0));

        notas2.remove(0);
        System.out.println("Mostre a primeira nota da nova lista removendo-a: "+ notas2);

    }
}
