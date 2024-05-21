package ex1;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.setModelo("Camry");
		c1.setMarca("Toyota");
		c1.setCor("Prata");
		c1.setAno(2022);
		c1.setQntPortas(4);
		
		Moto m1 = new Moto();
		m1.setModelo("CR-V");
		m1.setMarca("Honda");
		m1.setCor("Azul");
		m1.setAno(2023);
		m1.setCilindradas(300);
		
		System.out.println("Carro:");
		c1.imprime();
		System.out.println();
		System.out.println("Moto:");
		m1.imprime();
	}

}
