public class MediaAritmetica {
	int[] primeirosNumeros = {8, 9, 7};
	int[] demaisNumeros = {4, 5, 6};
	int soma = 0;
	double primeiraMedia, segundaMedia, mediaTotal;
	public static final int QTD_MEDIA_TOTAIS = 2;

	public double calcularMedia () {
		int i:
		for (i=0; i<primeirosNumeros.length; i++) {
			soma += primeirosNumeros[i]; 
		}
		primeiraMedia = soma / primeirosNumeros.length;

		for (i=0; i<demaisNumeros.length; i++) {
			soma += demaisNumeros[i];
		}
		segundaMedia = soma / demaisNumeros.length;

		mediaTotal = (primeiraMedia + segundaMedia) / QTD_MEDIA_TOTAIS;
	}

	public String toString() {
		return "Primeira Media: " + primeiraMedia +
			   "\nSegunda Media: " + segundaMedia + 
			   "\nMedia Total: " + mediaTotal;
	}

	public static void main(String[] args) {
		MediaAritmetica medias = MediaAritmetica();

		medias.calcularMedia();
		System.out.println(medias.toString());
	}
}