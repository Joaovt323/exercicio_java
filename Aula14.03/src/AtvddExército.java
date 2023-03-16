import java.util.Scanner;

public class AtvddExército {

	public static void main(String[] args) {
		
  Scanner entrada = new Scanner(System.in);
 
  //Solicita a idade do usuário
  
  System.out.print("Digite sua idade: ");
  int idade = entrada.nextInt();
 
  
  //Verifica se o usuário tem o requesito necessário, que mostra o resultado ao mesmo
  
  if(idade >= 18) { System.out.print("Você pode entrar no exército.");
  }
  else { System.out.print("Você não pode participar do exército.");		
  }
  entrada.close();
	}
	 
}
