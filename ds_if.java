package aula1;
import java.util.Scanner;
public class ds_if {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		
		System.out.println("Escreve um numero:");
		a = in.nextInt();
		
		if(a < 0) {
			System.out.println("Este número é negativo");
		}else
		{
			System.out.println("Este número é positivo");
		}
	}
}
