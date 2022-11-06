package EstruturaDeRepeticao;

public class ForEmArrays {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
        // em arrays o indice inicia em Zero
        for (int x = 0; x < alunos.length; x++)
        {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }
    }
}
