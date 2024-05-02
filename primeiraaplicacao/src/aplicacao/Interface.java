package aplicacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
	public static void main(String[]args) {
		 // Criar uma nova janela
		JFrame frame = new JFrame("Sistema de Gest�o de estoque");
		frame.setSize(300, 200); // Definir o tamanho da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar
		
		// Criar um bot�o
		JButton button = new JButton("Clique para acessar o sistema");
		// Adicionar um ouvinte de evento ao bot�o
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// A��o a ser executada quando o bot�o for clicado
				JOptionPane.showMessageDialog(frame, "O sistema est� em funcionamento");
			}
		});
        
		// Adicionar o bot�o � janela
		frame.getContentPane().add(button);
		
		// Exibir a janela 
		frame.setVisible(true);
}

}