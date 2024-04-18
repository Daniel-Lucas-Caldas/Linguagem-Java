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
	      
	 System.out.printf("Informe o produto que será cadastrado: ");
     produto.produto = scan.next();
      
     System.out.printf("Informe a quantidade: ");
     produto.quantidade = scan.nextDouble();
      
     System.out.printf("Informe o preço individual: ");
     produto.preco = scan.nextDouble();
      
     System.out.printf("\n");

	 System.out.println("Confirmação - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: " + produto.produto + ", Estoque atual: " + produto.quantidade + ", Preço: " + produto.preco);
	
	 System.out.printf("Deseja inserir mais produtos? Quantos: ");
	 int estoque = scan.nextInt();
	 produto.addproduto(estoque);
	 
	 System.out.printf("Deseja inserir mais clientes? Quantos: ");
	 int publico = scan.nextInt();
	 cliente.addcliente(publico);
	 
	 System.out.printf("\n");
	
	 System.out.println("Atualização - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: "+produto.produto+", Estoque atual: "+produto.quantidade+", Preço: \n"+produto.preco);
		
	 System.out.printf("Atualmente, alguma venda foi realizada? Quantas? ");
	 estoque = scan.nextInt();
	 produto.subproduto(estoque);
	 
	 System.out.printf("Atualmente, alguma cliente deixou a loja? Quantos? ");
	 estoque = scan.nextInt();
	 cliente.subcliente(publico);
	 
	 System.out.printf("\n");
		
	 System.out.println("Atualização pós vendas - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: "+produto.produto+", Estoque atual: "+produto.quantidade+", Preço: \n"+produto.preco+", Valor atual do estoque: "+produto.preco*produto.quantidade);
	
	 JOptionPane.showConfirmDialog(null, "Atualização pós vendas - Nome do grupo: "+ cliente.cliente +", Quantidade de clientes: "+ cliente.quantidadeCliente +", Nome do produto: "+produto.produto+", Estoque atual: "+produto.quantidade+", Preço: \n"+produto.preco+", Valor atual do estoque: "+produto.preco*produto.quantidade);
	 scan.close();   
	}

}
