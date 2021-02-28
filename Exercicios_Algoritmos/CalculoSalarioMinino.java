public class CalculoSalarioMinino {
	public static final float SALARIO_MINIMO = 788.00f;
	private float salarioUsuario;
	private float qtdSalarioMinimo = 0f;

	public CalculoSalarioMinino (float salarioUsuario) {
		this.salarioUsuario = salarioUsuario;
	} 	

	public float calcularSalarioMinimo () {
		return qtdSalarioMinimo = salarioUsuario / SALARIO_MINIMO;
	}
	
	public String toString () {
		return "Salario minimo = R$" + SALARIO_MINIMO + "\nSalario Usuario = R$" + salarioUsuario + 
		" \nQuantidade de Salario Minino recebida = " + qtdSalarioMinimo;
	}

	public static void main(String[] args) {
		CalculoSalarioMinino calc = new CalculoSalarioMinino(1500);
		calc.calcularSalarioMinimo();
		System.out.println(calc.toString());
	}
}