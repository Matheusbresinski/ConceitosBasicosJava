package EstruturaDeRepeticao;
/*
    Break significa quebrar, parar, frear, interromper. E é isso que se faz quando o java encontra esse
     comando pela frente. Continue, como o nome diz, ele "continua" o laço. O comando break interrompe o laço,
     já o continue interrompe somente a iteração atual.
*/

public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++)
        {
            if (numero==3)
                break;//continue
            System.out.println(numero);
        }
    }
}
