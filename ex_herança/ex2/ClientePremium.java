package ex2;

public class ClientePremium extends Cliente {
	@Override
	public void calculaDesconto(double preco) {
        double valorDesconto = preco - (preco*0.15);
        this.setValor_promocional(valorDesconto);
        System.out.println("Cliente premium tem desconto de 15% porcento logo o pre�o final fica: " + valorDesconto);
    }
}
