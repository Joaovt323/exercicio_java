import java.util.Scanner;

public class AtvddEx�rcito {

	public static void main(String[] args) {
		
  Scanner entrada = new Scanner(System.in);
 
  //Solicita a idade do usu�rio
  
  System.out.print("Digite sua idade: ");
  int idade = entrada.nextInt();
 
  
  //Verifica se o usu�rio tem o requesito necess�rio, que mostra o resultado ao mesmo
  
  if(idade >= 18) { System.out.print("Voc� pode entrar no ex�rcito.");
  }
  else { System.out.print("Voc� n�o pode participar do ex�rcito.");		
  }
  entrada.close();
	}
	 
}
