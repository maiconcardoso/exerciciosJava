import java.util.Scanner;

public class TrocaNumero {
    Integer numA;
    Integer numB;
    Integer aux = 0;
    public void trocadorDeNumero() {
        aux = numB;
        numB = numA;
        numA = aux;
    }
    public void exibirValores() {
        System.out.println("NumA: " + numA);
        System.out.println("NumB: " + numB);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TrocaNumero trc = new TrocaNumero();

        System.out.print("Informe o valor de A: ");
        trc.numA = input.nextInt();
        System.out.print("Informe o valor de B: ");
        trc.numB = input.nextInt();

        trc.exibirValores();
        System.out.println("");
        trc.trocadorDeNumero();
        System.out.println("Valores depois da troca");
        trc.exibirValores();
        input.close();
    }
}
