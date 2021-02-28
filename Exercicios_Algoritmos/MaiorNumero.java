import java.util.Scanner;

public class MaiorNumero{
	Integer num1;
	Integer num2;

	public void compareTwoNumbers() {
		if (num1 > num2) {
			System.out.println("Maior numero digitado: " + num1);
		} else {
			System.out.println("Maior numero digitado: " + num2);
		}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MaiorNumero numero = new MaiorNumero();
		
		System.out.print("Digite um valor : ");
		numero.num1 = input.nextInt();
		System.out.print("Digite outro valor: ");
		numero.num2 = input.nextInt();
		
		numero.compareTwoNumbers();
		input.close();
	}
} 
