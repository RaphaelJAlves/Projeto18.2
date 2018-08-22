package Padroes_de_Botoes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class ButtonPadrao extends JButton{
	
	public ButtonPadrao(String texto) {
		super(texto);
		setFont(new Font("Arial", Font.PLAIN, 13));		
	}
	
	public ButtonPadrao(String texto, int font) {
		super(texto);
		setFont(new Font("Arial", Font.PLAIN, font));
	}
	
	public ButtonPadrao(String texto, int x, int y, int right, int donw) {
		super(texto);
		setBounds(x, y, right, donw);
		setFont(new Font("Arial", Font.BOLD, 16));
		setBackground(new Color(250,250,250));
		setForeground(new Color(0,0,0));
	}
}
