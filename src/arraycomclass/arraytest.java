package arraycomclass;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class arraytest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos a serem adicionados: ");
		int n = sc.nextInt();
		sc.nextLine();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o produto: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double price = sc.nextDouble();
			while(price < 0) {
				System.out.println("O preço tem que ser positivo! Digite novamente: ");
				price = sc.nextDouble();
			}
			sc.nextLine();
			
			vect[i] = new Product(name, price);
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		System.out.printf("Media de preco = %.2f%n", soma / vect.length);
		
		sc.close();
	}

}
