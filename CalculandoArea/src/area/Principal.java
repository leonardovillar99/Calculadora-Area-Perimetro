package area;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
		Retangulo rt = new Retangulo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a altura do ret�ngulo: ");
		rt.setAltura(leitor.nextDouble());
		
		System.out.println("Digite a largura do ret�ngulo: ");
		rt.setLargura(leitor.nextDouble());
		
		System.out.println("\nA �rea do tri�ngulo �: " + rt.calcularArea() 
		+ "\nO perim�tro do ret�ngulo �: " + rt.calcularPerimetro());
		
	}
}
