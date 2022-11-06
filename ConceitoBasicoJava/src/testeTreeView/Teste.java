package testeTreeView;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Pai pai = new Pai("1");
        pai.filhos.add(new Pai("jefim"));
        System.out.println(pai);

    }
}
class Pai{
    private String nome;
    List<Pai> filhos = null;

    public Pai(String nome) {
        this.nome = nome;
        filhos = new ArrayList<Pai>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", filhos=" + filhos +
                '}';
    }
}



