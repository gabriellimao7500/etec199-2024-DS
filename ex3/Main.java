package ex3;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    	
        Scanner in = new Scanner(System.in);
        
        Funcionario pedro = new Funcionario();
        System.out.println("Insira o salario bruto de Pedro");
        pedro.salarioBruto = in.nextDouble();
        
        System.out.println("O salario liquido de Pedro �:"+pedro.calcSalarioLiquido());
        
        System.out.println("Me fale quantos porcento voc� deseja aumentar o salario de pedro");
        double valor = in.nextDouble();
        pedro.aumentaSalario(valor);
        System.out.println("salario bruto atual: "+pedro.salarioBruto);
        System.out.println("O salario liquido atual de Pedro � de: "+pedro.salarioLiquido);
        
        
		Funcionario vagner = new Funcionario();
		System.out.print("Insira o salario bruto de Vagner: ");
		vagner.salarioBruto = in.nextDouble();
		
		System.out.println("O sal�rio liquido de Vagner �: "+vagner.calcSalarioLiquido());
		
		System.out.print("Insira a porcentagem de aumento no sal�rio de Vagner: ");
		valor = in.nextDouble();
		vagner.aumentaSalario(valor);
        System.out.println("salario bruto atual: "+pedro.salarioBruto);
  		System.out.println("O sal�rio l�quido de Vagner ap�s reajuste ficou em: "+vagner.salarioLiquido);
    }
}