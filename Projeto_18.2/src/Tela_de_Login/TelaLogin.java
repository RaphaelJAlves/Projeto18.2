package Tela_de_Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Padroes_de_Botoes.ButtonPadrao;
import Padroes_de_Campos_de_Texto.TextoFieldPadrao;
import Padroes_de_Fontes.PasswordPadrao;
import Padroes_de_Tela.TelaPadrao;
import Padroes_de_Textos.LabelPadrao;
import Usuario.UsuarioCliente;

public class TelaLogin extends TelaPadrao{
	
	private TextoFieldPadrao usuarioLogin;
	private PasswordPadrao senhaLogin;
	private ButtonPadrao botaoLogin, botaoVoltar;
	
	public TelaLogin(String titulo) {
		super(titulo);
		ItensDoLogin();
		setVisible(true);
	}
	
	private void ItensDoLogin() {
		
		addLabesLogin();
		addCamposLogin();
		addBotoesLogin();
	}
	
	private void addLabesLogin() {
		
		this.add(new LabelPadrao("Login", 15, 150, 220, 100, 30));
		
		this.add(new LabelPadrao("Senha", 15, 150, 280, 100, 30));
	}
	
	private void addCamposLogin() {
		
		usuarioLogin = new TextoFieldPadrao(150, 250, 300, 25);
		this.add(usuarioLogin);
		
		senhaLogin = new PasswordPadrao(20, 150, 310, 300, 25);
		this.add(senhaLogin);
	}
	
	private void addBotoesLogin() {	
		
		botaoLogin = new ButtonPadrao("Login", 150, 390, 300, 35);
		botaoLogin.addActionListener(new OuvinteLogin(this));
		this.add(botaoLogin);
		
		botaoVoltar = new ButtonPadrao("Voltar", 150, 440, 300, 35);
		this.add(botaoVoltar);
	}
	
	private class OuvinteLogin implements ActionListener {
		
		private JFrame tela;
		
		public OuvinteLogin(JFrame tela) {
			this.tela = tela;
		}

		public void actionPerformed(ActionEvent e) {
			
			String login = usuarioLogin.getText();
			String senha = new String(senhaLogin.getPassword());
			
			ArrayList<UsuarioCliente> cadastrado = Dados_do_Usuario.CentralDados.dados().getUsuario();
			
			boolean lock = false;
			
			UsuarioCliente usuario = null;
			
			for (UsuarioCliente user: cadastrado) {
				if (user.getLogin().equals(login) == true && 
					user.getSenha().equals(senha) == true) {
			
					lock = true;
					usuario = user;
					break;
				}
			}
			if (!lock) {
				JOptionPane.showMessageDialog(tela, "Você não está cadastrado");
			} else {
//				if (usuario.getTratamento().equals("vendedor") == true)
//					new Vendedor("Vendedor", usuario);
//				new Comprador();
				dispose();	
			}
		}	
	}
	
	
	
	
	
	
	
	
	

}
