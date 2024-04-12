package aplicacao;

public class Produto {
	public String produto;
	public Double quantidade;
	public Double preco;
	
    public void addproduto (int estoque) {
    	this.quantidade += estoque; // faz referencia a quantidade devido a relação com estoque \\
    }
    
    public void subproduto(int estoque) {
    	this.quantidade -= estoque;
    }
    
  
}
