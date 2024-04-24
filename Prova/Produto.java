
public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	public Produto(){
		id = 0;
		nome = "produto";
		preco = 39.99;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calcularDesconto(double desconto) {
		desconto = (preco * desconto)/100;
		double precoComDesconto = preco - desconto;
		
		id ++;
		
		return precoComDesconto;
		
	}


}
