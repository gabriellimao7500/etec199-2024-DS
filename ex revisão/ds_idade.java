package aula1;
import java.util.Scanner;
public class ds_idade {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int anoNasc, anoAtual, idade;
		String cont = "Nao";
		
		do{
			
			System.out.println("Escreva o ano de nascimento");
			anoNasc = in.nextInt();
			
			System.out.println("Escreva o ano de atual");
			anoAtual = in.nextInt();
			
			idade = anoAtual - anoNasc;
			
			if (idade > 18) {
				System.out.println("Essa pessoa é maior de idade");
			}else {
				System.out.println("Essa pessoa é menor de idade");
			}
				
			System.out.println("Deseja calcular a idade de mais uma pessoa?");
			cont  = in.next();
			
		}while (cont.equalsIgnoreCase("SIM") || cont.equalsIgnoreCase("S"));
	}
}
