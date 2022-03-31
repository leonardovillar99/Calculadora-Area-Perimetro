package area;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
		Retangulo rt = new Retangulo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a altura do retângulo: ");
		rt.setAltura(leitor.nextDouble());
		
		System.out.println("Digite a largura do retângulo: ");
		rt.setLargura(leitor.nextDouble());
		
		System.out.println("\nA área do triângulo é: " + rt.calcularArea() 
		+ "\nO perimêtro do retângulo é: " + rt.calcularPerimetro());
		
	}
}
