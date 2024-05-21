package ex1;

public class Moto extends Veiculo{

	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Cilindrada: " + this.cilindradas);
	}
	
}
