package aplicacao;

public class Produtos {
	public String produto;
	public Double quantidade;
	public Double preco;
	
    public void addproduto (int estoque) {
    	this.quantidade += estoque; 
    }
    
    public void subproduto(int estoque) {
    	this.quantidade -= estoque;
    }
}
