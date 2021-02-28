public class ReajusteDeValor {
	private float valor;
	private float valorReajustado;
	public static final int REAJUSTE = 1;
	public static final int PERCENTUAL = 100;

	public float calcularReajuste (float valor) {
		this.valor = valor;
		valorReajustado = ((valor * REAJUSTE) / PERCENTUAL) + valor;
		return valorReajustado;
	}

	public String toString() {
		return "Valor Informado: " + valor +
			   "\nValor Reajustado: " + valorReajustado;
	}

	public static void main(String[] args) {
		ReajusteDeValor reajuste = new ReajusteDeValor();

		reajuste.calcularReajuste(1000);
		System.out.println(reajuste.toString());
	} 
}