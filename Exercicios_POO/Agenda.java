public class Agenda extends Pessoa{
	Pessoa[] pessoa = new Pessoa[10];
	private int index;
	private String nomeDigitado;
	public int i = 0;


	public void armazenaPessoa (String nome, int idade, float altura) {
		if (i<10) {
			pessoa[i] = new Pessoa();
			pessoa[i].setNome(nome);
 			pessoa[i].setIdade(idade);
 			pessoa[i].setAltura(altura); 
 			i++;
		}	 		
	}

	public void removePessoa (String nome) {
		for (i=0; i<pessoa.length; i++) {
			if (nome.equals(pessoa[i].getNome())){
				pessoa[i].setNome(null);
				pessoa[i].setIdade(0);
 				pessoa[i].setAltura(0.0f); 
			}
			if (pessoa[i].getNome() == null ) {
				System.out.println("");
				System.out.println("O nome " + nome + " foi removido com sucesso!");
			} 
		}
	}

	public int buscaPessoa (String nome) {
		for (i=0; i<pessoa.length; i++) {
			if (nome.equals(pessoa[i].getNome())){
				System.out.print("O nome se encontra no indice: ");
				return i;
			} 
		}
		System.out.print("Nome nao encontrado: ");
		return 0;
	}

	public void imprimeAgenda () {
		System.out.println("");
		System.out.println("=========== AGENDA =============");
		System.out.println("");
		for (i=0; i<pessoa.length; i++) {
			System.out.println(pessoa[i].getNome() + " | " + pessoa[i].getIdade() + " Anos | " + pessoa[i].getAltura() + " de Altura");
		}
		System.out.println("");
	}

	public void imprimePessoa (int index) {
		for (i=0; i<pessoa.length; i++){
			if (index == i){
				pessoa[index] =  pessoa[i];
			} 
		} 
		System.out.println("");
		System.out.println("========= Busca de Pessoa ========");
		System.out.println(pessoa[index].getNome() + " | " + pessoa[index].getIdade() + " Anos | " + pessoa[index].getAltura() + " de Altura");
		System.out.println("");
	}

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		//Cadastrando pessoas na agenda
			agenda.armazenaPessoa("Joao da Silva", 31, 1.80f);
			agenda.armazenaPessoa("Jose Carlos", 28, 1.67f);
			agenda.armazenaPessoa("Maria Joaquina", 25, 1.60f);
			agenda.armazenaPessoa("Carlos Andre da Silva", 40, 1.70f);
			agenda.armazenaPessoa("Amanda Rodrigues", 30, 1.70f);
			agenda.armazenaPessoa("Leticia Bruni", 32, 1.65f);
			agenda.armazenaPessoa("Manoel da Nobrega", 65, 1.90f);
			agenda.armazenaPessoa("Vitor Rafael", 43, 1.70f);
			agenda.armazenaPessoa("Antonio Carlos", 55, 1.83f);
			agenda.armazenaPessoa("Manu Gabriella", 24, 1.67f);
		
		//Imprimindo dados de todas as Pessoas da agenda
			agenda.imprimeAgenda();
			agenda.imprimePessoa(5);
			System.out.println(agenda.buscaPessoa("Antonio Carlos"));

		//Removendo pessoas da agenda
			agenda.removePessoa("Antonio Carlos");

	 	//Imprimindo dados atualizados de todas as Pessoas da agenda
			agenda.imprimeAgenda();
		
	}
}