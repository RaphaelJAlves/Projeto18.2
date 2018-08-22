package Padroes_de_Fontes;

import java.awt.Color;

import javax.swing.JCheckBox;

public class CheckBoxPadrao extends JCheckBox{
	
	public CheckBoxPadrao(String texto, int x, int y, int comprimento, int largura) {
		super(texto);
		setBounds(x, y, comprimento, largura);
		setSelected(false);
		setBackground(new Color(255,255,255));
		setForeground(new Color(0,0,0));
	}
}
