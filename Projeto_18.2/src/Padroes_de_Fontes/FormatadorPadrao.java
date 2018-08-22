package Padroes_de_Fontes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class FormatadorPadrao extends JFormattedTextField{
	
	public FormatadorPadrao(MaskFormatter formatado, int fonte, int x, int y, int tamanho, int largura) {
		super(formatado);
		setBounds(x, y, tamanho, largura);
		setFont(new Font("Arial", Font.BOLD, fonte));
		setBackground(new Color(250,250,250));
	}
}
