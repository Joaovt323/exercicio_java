import java.util.Scanner;

public class Maior_que_20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite um valor: ");
		double valor1 = entrada.nextDouble();
		
		System.out.print("Digite outro valor: ");
		double valor2 = entrada.nextDouble();
		
		double resultado = valor1 + valor2;
		
		if(resultado>20){ 
			double maior = resultado + 5;
			System.out.print("O resultado é: " + maior);}
		
		
		else {  double menor = resultado * 8;
			System.out.print("O resultado é: " + menor);}
		
		entrada.close();
		

	}

}
