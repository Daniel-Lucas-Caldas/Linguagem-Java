package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interface {
  public static void man(String[]args) {
	  
	  // Criar uma nova janela
	  JFrame frame = new JFrame("Simple GUI Exemple");
	  frame.setSize(400, 300); // Definir o tamanho da janela
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar quando a janela for fechada
	  frame.setLayout(null); // Definir layout como nulo
	  
	  // R�tulo para o campo de texto
	  JLabel label = new JLabel("Digite algo:");
	  label.setBounds(20, 20, 100, 20);
	  frame.add(label);
	  
	  // Campo de texto
	  JTextField textField = new JTextField();
	  textField.setBounds(120, 20, 200, 20);
	  frame.add(textField);
	  
	  // �rea de Texto
	  JTextArea textArea = new JTextArea();
	  textArea.setBounds(20, 50, 300, 150);
	  frame.add(textArea);
	  
	  // Bot�o
	  JButton button = new JButton("Clique aqui"); 
	  button.setBounds(150, 220, 100, 30);
	  // Adicionar um ouvinte de evento ao bot�o
	  button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  // A��o a ser executada quando o bot�o for clicado
			  String textoDigitado = textField.getText();
			  textArea.append(textoDigitado + "\n");
			  textField.setText(""); // Limpar o campo de texto ap�s clicar no bot�o
		  }
	  });
	  frame.add(button);
	  
	  // Exibir a janela 
	  frame.setVisible(true);
  }
}