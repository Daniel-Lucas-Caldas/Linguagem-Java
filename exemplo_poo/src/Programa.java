package aplicacao;
import java.util.Scanner;

public class Programa {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.printf("Informe o produto que ser� cadastrado: ");
		produto.produto = scan.next();
		
		System.out.printf("Informe a quantidade: ");
		produto.quantidade = scan.nextDouble();
		
		System.out.printf("Informe o pre�o individual: ");
		produto.preco = scan.nextDouble();
		
		System.out.printf("\n");
		
		System.out.println("Confirma��o: " + produto.produto + ", Estoque atual: " + produto.quantidade + ", Pre�o: " + produto.preco);
		
		System.out.printf("Deseja inserir mais produtos? Quantos: ");
		int estoque = scan.nextInt();
		produto.addproduto(estoque);
		
		System.out.println("Atualiza��o: "+produto.produto+", Estoque atual: "+produto.quantidade+", Pre�o: \n"+produto.preco);
		
		System.out.printf("Atualmente, alguma venda foi realizada? Quantas?");
		estoque = scan.nextInt();
		produto.subproduto(estoque);
		
		System.out.println("Atualiza��o p�s vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+", Pre�o: \n"+produto.preco);
	
		scan.close();
}
}