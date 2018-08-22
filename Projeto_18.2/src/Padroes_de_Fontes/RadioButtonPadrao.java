package Padroes_de_Fontes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JRadioButton;

public class RadioButtonPadrao extends JRadioButton{
	
	public RadioButtonPadrao(String texto, int fonte, int x, int y, int tamanho, int largura) {
		super(texto);
		setBounds(x, y, tamanho, largura);
		setFont(new Font("Arial", Font.BOLD, fonte));
		setBackground(new Color(255,255,255));
		setForeground(new Color(0,0,0));
	}
}
