package Usuario;

import java.util.Date;


import Sexo.Sexo;

public class UsuarioCliente {
	
	private String senha, login, eMail, nome;
	private Date dataNascimento, dataCadastro;
	private boolean administrador;
	private int idade;
	private Sexo sexo;
	
	public UsuarioCliente(String nome, String login, String senha, 
				   String eMail, int idade, Date dataNascimento, Sexo sexo) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.eMail = eMail;
		this.sexo = sexo;
		this.idade = idade;
		this.dataCadastro = new Date(System.currentTimeMillis());
		this.dataNascimento = dataNascimento;
		this.administrador = false;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
