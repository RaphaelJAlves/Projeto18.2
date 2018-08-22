package Padroes_de_Campos_de_Texto;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class TextoAreaPadrao extends JTextArea{
	
	public TextoAreaPadrao(int fonte, int x, int y, int tamanho, int largura) {
		setBounds(x, y, tamanho, largura);
		setFont(new Font("Arial", Font.PLAIN, fonte));
		setLineWrap(true);
		setWrapStyleWord(true);
		setBackground(new Color(250,250,250));
		setForeground(new Color(0,0,0));
		
		
	}
}
