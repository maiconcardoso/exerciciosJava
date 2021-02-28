import java.util.Scanner;

public class ComparaNumero {
    Integer num1;
    Integer num2;
    
    public void comparadorDeNumeros() {
        if (num1 == num2) {
            System.out.println("O primeiro numero e semelhante ao segundo: " + num1 + " = " + num2);
        } else if (num1 < num2){
            System.out.println("Segundo numero e maior que o primeiro! ");    
        } else if (num2 < num1) {
            System.out.println("Primeiro numero e maior que segundo! ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ComparaNumero compare = new ComparaNumero();

        System.out.print("Informe o valor do primeiro numero: ");
        compare.num1 = input.nextInt();
        System.out.print("Informe o valor do segundo numero: ");
        compare.num2 = input.nextInt();

        compare.comparadorDeNumeros();
        input.close();
    }
}
