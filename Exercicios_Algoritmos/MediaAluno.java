import java.util.Scanner;

public class MediaAluno {
    Integer[] notas = new Integer[4];
    Scanner input = new Scanner(System.in);
    Double somaNotas = 0.0;
    Double mediaNotas = 0.0;
    Integer valorNota;

    public void adicionarNotas () {
        for (int count=0; count<notas.length; count++) {
            System.out.print("insira o valor da " + (count+1) + " nota: ");
            valorNota = input.nextInt();
            if (valorNota < 0 || valorNota > 100) {
                System.out.println("");
                System.out.println("Por favor inserir somente valores validos na nota: ");
                System.out.println("");
                System.out.print("insira o valor da " + (count+1) + " nota: ");
                valorNota = input.nextInt();
            } else {
                notas[count] = valorNota;
                somaNotas += notas[count];
            } 
        }        
    }
    public void calcularMediaAluno () {
        mediaNotas = somaNotas / notas.length;
        System.out.println("O valor da media corresponde a: " + mediaNotas);
    }
    public static void main(String[] args) {
        MediaAluno media = new MediaAluno();
        media.adicionarNotas();
        media.calcularMediaAluno();
    }
}
