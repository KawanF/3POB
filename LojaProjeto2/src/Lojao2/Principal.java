package Lojao2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o tamanho da Array: ");
		int tamanho = sc.nextInt();
		sc.nextLine();
		
		Produto[] prdObj = new Produto[tamanho];
		
		for(int i=0;i<tamanho;i++) {
			System.out.println("digite o nome do produto: ");
			String nome=sc.nextLine();
			System.out.println("digite o pre�o do produto: ");
			double preco= sc.nextDouble();
			sc.nextLine();
			prdObj[i] = new Produto(nome,preco);
		}
		
		for(int i=0;i<tamanho;i++) {
			System.out.println("Posi��o "+i+": "+"Nome: "+prdObj[i].getNome()+" Pre�o: "+prdObj[i].getPreco());
		}
		sc.close();
	}
}
