package Padroes_de_Fontes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;

public class ComboBoxPadrao extends JCheckBox{
	
	public ComboBoxPadrao(String texto, int x, int y, int right, int donw) {
		super(texto);
		setBounds(x, y, right, donw);
		setFont(new Font("Arial", Font.BOLD, 16));
		setBackground(new Color(92,51,23));
		setForeground(new Color(250,250,250));
	}

}
