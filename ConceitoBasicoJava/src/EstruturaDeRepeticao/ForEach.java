package EstruturaDeRepeticao;
/*
    O uso do for / each está fortemente relacionado com um cenário onde contenha um array ou coleção,
    e assim a interação é baseada aos elementos da coleção
*/
public class ForEach {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (String aluno : alunos)
        {
            System.out.println("Nome do aluno é : " + aluno);
        }
    }
}
