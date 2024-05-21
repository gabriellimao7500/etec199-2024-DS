package ex1;

public class Carro extends Veiculo{

	private int qntPortas;

	public int getQntPortas() {
		return qntPortas;
	}

	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Quantidade de portas: " + this.qntPortas);
	}
	
}
