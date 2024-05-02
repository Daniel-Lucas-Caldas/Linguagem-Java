package aplicacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
	public static void main(String[]args) {
		 // Criar uma nova janela
		JFrame frame = new JFrame("Sistema de Gestão de estoque");
		frame.setSize(300, 200); // Definir o tamanho da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar
		
		// Criar um botão
		JButton button = new JButton("Clique para acessar o sistema");
		// Adicionar um ouvinte de evento ao botão
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação a ser executada quando o botão for clicado
				JOptionPane.showMessageDialog(frame, "O sistema está em funcionamento");
			}
		});
        
		// Adicionar o botão á janela
		frame.getContentPane().add(button);
		
		// Exibir a janela 
		frame.setVisible(true);
}

}