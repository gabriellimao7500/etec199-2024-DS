package aula1;
import java.util.Scanner;
public class ds_while {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int pass,realpass;
		realpass = 2002;
		pass = 0;
		
		System.out.println("Diga a senha");
		while(pass != realpass) {
			pass = in.nextInt();
			if(pass == realpass) {
				System.out.println("Acesso Permitido!");
			}else {
				System.out.println("Senha Invalida, tente outra senha!");
			}
		}
	}
}
