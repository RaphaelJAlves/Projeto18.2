package Padroes_de_Campos_de_Texto;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.JTextField;

public class TextoFieldPadrao extends JTextField {
	
	public TextoFieldPadrao(int x, int y, int right, int donw) {
		setBounds(x, y, right, donw);
		setFont(new Font("Arial", Font.PLAIN, 20));
		setBackground(new Color(250,250,250));
		setForeground(new Color(0,0,0));
	}
	
	public TextoFieldPadrao(String texto, boolean booleano, int x, int y, int right, int donw) {
		super(texto);
		setBounds(x, y, right, donw);
		setFont(new Font("Arial", Font.PLAIN, 18));
		setEditable(booleano);
		setBackground(new Color(250,250,250));
		setForeground(new Color(0,0,0));
	}
	
}
