public class Elevador {

	//Atributos
	private int terreo = 0;
	private int andar = 0;
	private int andarAtual;
	private int totalDeAndares;
	private int capacidadeDoElevador;
	private int qtdPessoas;
	private int totalPessoasNoElevador = 0;

	//Metodos Getters
	public int getTerreo () {
		return this.terreo;
	}
	public int getAndarAtual () {
		return this.andarAtual;
	}
	public int getAndar () {
		return this.andar;
	}
	public int getTotalDeAndares () {
		return this.totalDeAndares;
	}
	public int getCapacidadeDoElevador () {
		return this.capacidadeDoElevador;
	}
	public int getQtdPessoas () {
		return this.qtdPessoas;
	} 
	public int getTotalPessoasNoElevador() {
		return this.totalPessoasNoElevador;
	}

	// Métodos Setters
	public void setTerreo (int terreo) {
		this.terreo = terreo;
	}
	public void setAndarAtual (int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public void setAndar (int andar) {
		this.andar = andar;
	}
	public void setTotalDeAndares (int setTotalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}
	public void setCapacidadeDoElevador (int capacidadeDoElevador) {
		this.capacidadeDoElevador = capacidadeDoElevador;
	}
	public void setQtdPessoas (int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public void setTotalDePessoasNoElevador (int totalPessoasNoElevador) {
		this.totalPessoasNoElevador = totalPessoasNoElevador;
	}

	//Métodos da Classe Elevador
	public void inicializarElevador (int capacidadeDoElevador, int totalDeAndares) {
		this.capacidadeDoElevador = capacidadeDoElevador;
		this.totalDeAndares = totalDeAndares;

	} 

	public void entrarNoElevador (int qtdPessoas) {
		if (totalPessoasNoElevador < capacidadeDoElevador) {
			totalPessoasNoElevador = totalPessoasNoElevador + qtdPessoas;
		} else {
			System.out.println("A quantidade de pessoas no elevador excede a capacidade suportada.");
		}
	}

	public void sairDoElevador (int qtdPessoas) {
		if (qtdPessoas <= totalPessoasNoElevador) {
			totalPessoasNoElevador = totalPessoasNoElevador - qtdPessoas;
		} else {
			System.out.println("Não ha pessoas no elevador");
		}
	}

	public void subirElevador (int andar) {
		if ((andar + andarAtual) > totalDeAndares) {
			System.out.println("Nao e possivel subir, pois atingimos o limite maximo");
		}
		else if (andarAtual >= terreo){
			andarAtual = andarAtual + andar;
		} 
	}

	public void descerElevador (int andar) {
		if ((andarAtual - andar) < terreo) {
			System.out.println("Nao e possivel descer, pois ja chegamos ao terreo");
		}
		else if (andarAtual > terreo) {
			andarAtual = andarAtual - andar;
		}
	}

	public String toString () {
		return "Capacidade Do elevador: " + capacidadeDoElevador + 
		"\nTotal de Andares: " + totalDeAndares +
		"\nAndar Atual: " + andarAtual + 
		"\nQuantidade de Pessoas no elevador: " + totalPessoasNoElevador + "\n";
	}

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		elevador.inicializarElevador(30, 10);
		elevador.entrarNoElevador(8);
		elevador.entrarNoElevador(22);
		elevador.subirElevador(1);
		elevador.subirElevador(9);
		elevador.descerElevador(11);
		System.out.println(elevador.toString());
	}
}