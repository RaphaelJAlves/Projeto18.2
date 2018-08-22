package Padroes_de_Fontes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPasswordField;

public class PasswordPadrao extends JPasswordField{
	
	public PasswordPadrao(int fonte, int x, int y, int tamanho, int largura) {
		setBounds(x, y, tamanho, largura);
		setFont(new Font("Arial", Font.PLAIN, fonte));
		setBackground(new Color(250,250,250));
	}
}
