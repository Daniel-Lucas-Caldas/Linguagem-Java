package aplicacao;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[]args) {
	 Scanner scan = new Scanner(System.in);
	 Cliente cliente = new Cliente();
	 Produto produto = new Produto();
		
	 System.out.printf("Informe o nome do grupo de clientes: ");
     cliente.cliente = scan.next();
      
     System.out.printf("Informe a quantidade de clientes no grupo: ");
     cliente.quantidadeCliente = scan.nextDouble();
 
	 System.out.printf("\n");
	      
	 System.out.printf("Informe o produto que ser� cadastrado: ");
     produto.produto = scan.next();
      
     System.out.printf("Informe a quantidade: ");
     produto.quantidade = scan.nextDouble();
      
     System.out.printf("Informe o pre�o individual: ");
     produto.preco = scan.nextDouble();
      
     System.out.printf("\n");

	 System.out.println("Confirma��o - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: " + produto.produto + ", Estoque atual: " + produto.quantidade + ", Pre�o: " + produto.preco);
	
	 System.out.printf("Deseja inserir mais produtos? Quantos: ");
	 int estoque = scan.nextInt();
	 produto.addproduto(estoque);
	 
	 System.out.printf("Deseja inserir mais clientes? Quantos: ");
	 int publico = scan.nextInt();
	 cliente.addcliente(publico);
	 
	 System.out.printf("\n");
	
	 System.out.println("Atualiza��o - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: "+produto.produto+", Estoque atual: "+produto.quantidade+", Pre�o: \n"+produto.preco);
		
	 System.out.printf("Atualmente, alguma venda foi realizada? Quantas? ");
	 estoque = scan.nextInt();
	 produto.subproduto(estoque);
	 
	 System.out.printf("Atualmente, alguma cliente deixou a loja? Quantos? ");
	 estoque = scan.nextInt();
	 cliente.subcliente(publico);
	 
	 System.out.printf("\n");
		
	 System.out.println("Atualiza��o p�s vendas - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: "+produto.produto+", Estoque atual: "+produto.quantidade+", Pre�o: \n"+produto.preco+", Valor atual do estoque: "+produto.preco*produto.quantidade);
	
	 JOptionPane.showConfirmDialog(null, "Atualiza��o p�s vendas - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: "+produto.produto+", Estoque atual: "+produto.quantidade+", Pre�o: \n"+produto.preco+", Valor atual do estoque: "+produto.preco*produto.quantidade);
	 scan.close();   
	}

}
