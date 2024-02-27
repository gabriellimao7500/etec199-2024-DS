package aula1;
import java.util.Scanner;
public class ds_if_two {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a;
		
		System.out.println("Escreva um número");
		a = in.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("O número é par.");
		}else {
			System.out.println("O número é impar.");
		}
			
	}
}
