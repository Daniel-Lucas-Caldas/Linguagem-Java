package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		Produtos produto = new Produtos();
		
		System.out.printf("Informe o produto que será cadastrado: ");
		produto.produto = scan.next();
		
		System.out.printf("Informe a quantidade: ");
		produto.quantidade = scan.nextDouble();
		
		System.out.printf("Informe o preço individual: ");
		produto.preco = scan.nextDouble();
		
		System.out.printf("\n");
		
		System.out.println("Confirmação: " + produto.produto + ", Estoque atual: " + produto.quantidade + ", Preço: " + produto.preco);
		
		System.out.printf("Deseja inserir mais produtos? Quantos: ");
		int estoque = scan.nextInt();
		produto.addproduto(estoque);
		
		System.out.printf("\n");
		
		System.out.println("Atualização: "+produto.produto+", Estoque atual: "+produto.quantidade+", Preço: \n"+produto.preco);
		
		System.out.printf("Atualmente, alguma venda foi realizada? Quantas? ");
		estoque = scan.nextInt();
		produto.subproduto(estoque);
		
		System.out.printf("\n");
		
		System.out.println("Atualização pós vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+", Preço: \n"+produto.preco+", Valor atual do estoque: "+produto.preco*produto.quantidade);
		
		JOptionPane.showConfirmDialog(null,"Atualização pós vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+", Preço: "+produto.preco+", Valor atual do estoque: "+produto.preco*produto.quantidade);
	
		scan.close();
}

	}
