package ex2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Quadrado quadrado1 = new Quadrado();
        
        System.out.println("Insira a altura do quadrado 1");
        quadrado1.altura = in.nextDouble();
        
        System.out.println("Insira a base do quadrado 1");
        quadrado1.base = in.nextDouble();

        Quadrado quadrado2 = new Quadrado();
        
        System.out.println("Insira a altura do quadrado 2");
        quadrado2.altura = in.nextDouble();
        
        System.out.println("Insira a base do quadrado 2");
        quadrado2.base = in.nextDouble();

        System.out.println("A area do quadrado 1 �: "+quadrado1.calcularArea()+", e a area do quadrado 2 �:"+quadrado2.calcularArea());
    }
}
