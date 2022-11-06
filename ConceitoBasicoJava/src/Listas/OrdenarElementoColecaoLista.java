package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarElementoColecaoLista {
    public static void main(String[] args) {
        // Dadas as sequintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo
        /*
        * (nome-idade-cor);  Covalcante, Today . New class
        *
        * Gato 1 =  nome: jhon, idade: 18, cor: preto
        * Gato 2 =  nome: Simba, idade: 6, cor: tigrado
        * Gato 3 =  nome: Tutu, idade: 12, cor: amarelo
        *
        *
        * */

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jhon",13,"cor"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Tutu",12,"amarelo"));
        }};

        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("---\tOrdem aleatoria\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Nome/cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());//
    }
}
class ComparatorIdade implements Comparator<Gato>
{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>
{
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>
{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        //se os nomes forem diferentes irá ordenar por nome
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) return nome;
        // se não ordena por cor.... se os nome forem iguais e as cores forem diferentes ira odernar por cor
        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return cor;
        //mas se os nomes forem iguais e as cores forem iguais ira ordenar por idade
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}