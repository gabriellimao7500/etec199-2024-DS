package ex2;

public class Cliente {
	
	private String nome;
	private int idade;
	private String endereco;
	private double valor_pedido;
	private double valor_promocional;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValor_pedido() {
		return valor_pedido;
	}
	public void setValor_pedido(double valor_pedido) {
		this.valor_pedido = valor_pedido;
	}
	public double getValor_promocional() {
		return valor_promocional;
	}
	public void setValor_promocional(double valor_promocional) {
		this.valor_promocional = valor_promocional;
	}
	
	public void calculaDesconto(double preco){
		double valorDesconto = preco - (preco*0.1);
		this.setValor_promocional(valorDesconto);
		System.out.println("Cliente comum tem desconto de 10% porcento logo o preço final fica: " + valorDesconto);
	}
	
}
