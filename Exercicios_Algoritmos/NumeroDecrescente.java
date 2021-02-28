import java.security.DigestInputStream;
import java.util.Scanner;

public class NumeroDecrescente {
    Integer digitValue;

    public void countRegressive () {
        for (int count = digitValue; count >= 0; count--){
            if (count > 0) {
                System.out.print(count + ", ");
            } else {
                System.out.print(count + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumeroDecrescente numeroDigitado = new NumeroDecrescente();

        System.out.print("Digite um valor que seja superior a zero: ");
        numeroDigitado.digitValue = input.nextInt();

        numeroDigitado.countRegressive();
        input.close();
    }
}
