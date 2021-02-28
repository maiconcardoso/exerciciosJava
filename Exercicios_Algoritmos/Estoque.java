public class Estoque {
	private float ipi;
	private int codigoPecas;
	private float valorPecas;
	private int qtdPecas;
	public static final int PERCENTUAL = 100;
	public static final int COD_IPI = 1;
	

	public void cadastrarPeca (int codigoPecas, float valorPecas, int qtdPecas) {
		this.codigoPecas = codigoPecas;
		this.valorPecas = valorPecas;
		this.qtdPecas = qtdPecas; 
	}	

	public double calcularPagamentoPecas () {
		
		return (valorPecas * qtdPecas) * (ipi/PERCENTUAL+COD_IPI);	
	}
}