public class CalculoParImpar {
    Integer par;
    Integer impar;
    Integer soma = 0;
    long multiplicao = 1;
    
    public void somarImpares() {
        for (int count=1; count<=30; count++) {
            if (count%2 != 0) {
                 soma += count;
            }
        }
        System.out.println("Soma dos numeros impares equivale a: " + soma);
    }

    public void multiplicarPares() {
        for (int count=1; count<=30; count++) {
            if (count%2 == 0) {
                multiplicao *= count;
            } 
        }
        System.out.println("Multiplicacao dos numeros pares equivale a: " + multiplicao);
    }

    public static void main(String[] args) {
        CalculoParImpar calc = new CalculoParImpar();
        calc.somarImpares();
        calc.multiplicarPares();
    }
}
