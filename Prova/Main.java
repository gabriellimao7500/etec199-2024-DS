import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		Scanner in = new Scanner(System.in);
		
		while (true) {
		
		System.out.println("diga o nome do " + (produto.getId() + 1) +"° produto");
		produto.setNome(in.next());
		
		System.out.println("diga o preço do " + (produto.getId() + 1) +"° produto");
		produto.setPreco(in.nextDouble());
		
		System.out.println("diga o desconto do " + (produto.getId() + 1)+"° produto em %");
		
		System.out.println("Produto " + (produto.getId() + 1)+
				" : ID = "+ produto.getId()+ 
				", Nome = "+ produto.getNome()+ 
				", Preço = "+ produto.getPreco()+
				", Preço com desconto = " + produto.calcularDesconto(in.nextDouble()));
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("cadastre um novo produto");
		System.out.println("");
		}
	}
}
