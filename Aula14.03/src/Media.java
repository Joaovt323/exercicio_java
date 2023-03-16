import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner entrada = new Scanner(System.in);
	
 //Solicita o nome
  System.out.print("Digite seu nome: ");
  String nome = entrada.nextLine();
  
  //Solicita a nota das provas e faz o cálculo da média
  System.out.print("Digite sua nota da prova 1: ");
  double p1 = entrada.nextDouble();
  
  System.out.print("Digite sua nota da prova 2: ");
  double p2 = entrada.nextDouble();
  
  double media = (p1 + p2)/2;
  
  
  //informa a nota e se o usuário foi aprovado ou reprovado
  
  System.out.println(nome + ", sua nota foi: " + media);
  
  if(media>=7) { System.out.print(nome + ", você foi aprovado.");}
  
  else { System.out.print(nome + ", você foi reprovado.");}
  entrada.close();
  
	}
	

}
