package Padroes_de_Tela;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class TelaPadrao extends JFrame {
	
	
	public TelaPadrao(String titulo) {
		
		setTitle(titulo);
		setSize(600, 600);
		addTela();
		repaint();
	}
	
	private void addTela() {
		this.getContentPane().setBackground(new Color(255,255,255));
		new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFont(new Font("Arial", Font.BOLD, 40));
//		setIconImage(Icone.malhete.getImage());
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
	}

}
