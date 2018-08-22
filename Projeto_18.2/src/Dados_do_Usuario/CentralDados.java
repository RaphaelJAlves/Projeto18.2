package Dados_do_Usuario;

import java.util.ArrayList;
import java.util.Date;

import Sexo.Sexo;
import Usuario.UsuarioCliente;

//Padaro singtow

public class CentralDados {
	
	private ArrayList<UsuarioCliente> usuario = new ArrayList<UsuarioCliente>();
	private static CentralDados dado;
	
	public CentralDados() {
		this.inicializar();
	}
	
	private void inicializar() {
		usuario.add(new UsuarioCliente("Raphael J. Alves","admin", "12345", "admin@g.com", 18, (new Date(94, 03, 12)), Sexo.MASCULINO));
		
	}
	
	public static CentralDados dados() {
		if (dado == null)
			dado = new Arquivo().recuperar();
		return dado;
	}
	
	public void adicionar(UsuarioCliente usuario) {
		this.usuario.add(usuario);
	}
	
	public ArrayList<UsuarioCliente> getUsuario() {
		return usuario;
	}
}
