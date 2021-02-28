import java.util.Scanner;

public class ConversaoAnosDias {
	private int anosDeVida;
	private int mesesDeVida;
	private int diasDeVida;
	public static final int TOTAL_DIAS_ANO = 365;
	public static final int TOTAL_DIAS_MES = 30;
	int totalVidaEmDias = 0;

	public int anosEmDias (int anosDeVida, int mesesDeVida, int diasDeVida) {

		this.anosDeVida = anosDeVida;
		this.mesesDeVida = mesesDeVida;
		this.diasDeVida = diasDeVida;

		int totalAnos = anosDeVida * TOTAL_DIAS_ANO;
		int totalMeses = mesesDeVida * TOTAL_DIAS_MES;
		int totalDias = diasDeVida;
		return totalVidaEmDias = totalAnos + totalMeses + totalDias;
	}

	public String toString() {
		return anosDeVida + " Anos, " + mesesDeVida + " Meses e " + diasDeVida + " Dias = " + totalVidaEmDias + " dias";
 	}

 	public static void main(String[] args) {
 		ConversaoAnosDias convr = new ConversaoAnosDias();
 		Scanner input = new Scanner(System.in);
 		System.out.println("Informe qual a sua idade em anos, meses e dias");
 		System.out.print("Anos: ");
 		int anos = input.nextInt();
 		System.out.print("Meses: ");
 		int meses = input.nextInt();
 		System.out.print("Dias: ");
 		int dias = input.nextInt();
 		convr.anosEmDias(anos, meses, dias);
 		System.out.println(convr.toString());
 	}
}