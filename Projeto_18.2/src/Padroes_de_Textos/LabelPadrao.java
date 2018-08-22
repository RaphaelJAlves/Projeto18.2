package Padroes_de_Textos;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class LabelPadrao extends JLabel{
	
	public LabelPadrao(String texto,int fonte, int x, int y, int tamanho, int largura) {
		super(texto);
		setBounds(x, y, tamanho, largura);
		setFont(new Font("Arial", Font.BOLD, fonte));
		setForeground(new Color(0,0,0));
	}
}
