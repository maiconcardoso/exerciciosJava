public class EstoqueApp {
	public static void main(String[] args) {
		Estoque peca = new Estoque();
		peca.cadastrarPeca(1, 45.00f, 12);
		System.out.println(peca.calcularPagamentoPecas());
	}
}