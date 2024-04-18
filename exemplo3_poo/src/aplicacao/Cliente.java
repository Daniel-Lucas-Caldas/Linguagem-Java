package aplicacao;

public class Cliente {
    public String cliente;
    public Double quantidadeCliente;
    
public void addcliente (int publico) {
	   this.quantidadeCliente += publico;  
}
	   
public void subcliente (int publico) {
	    this.quantidadeCliente -= publico;
}
}