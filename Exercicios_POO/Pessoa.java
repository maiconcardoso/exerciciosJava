public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String anoNascimento = "";
	private float altura;
	private int idade = 0;
	public static final String TODAY = "27022021";
	private String anoAtual = "";

	public String getNome () {
		return this.nome;
	}
	public String getDataNascimento () {
		return this.dataNascimento;
	}
	public float getAltura () {
		return this.altura;
	}
	public int getIdade () {
		return this.idade;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setDataNascimento (String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setAltura (float altura) {
		this.altura = altura;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}

	public void calcularIdade () {
 		anoNascimento = dataNascimento.substring(4, 8);
 		anoAtual = TODAY.substring(4, 8);
 		idade = Integer.parseInt(anoAtual) - Integer.parseInt(anoNascimento);
	}

	public String toString () {
		return "Nome: " + nome + "\nIdade: " + idade + " Anos\nAltura: " + altura;
	} 
}