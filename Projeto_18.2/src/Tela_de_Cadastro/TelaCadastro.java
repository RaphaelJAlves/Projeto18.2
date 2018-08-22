package Tela_de_Cadastro;

import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import Padroes_de_Botoes.ButtonPadrao;
import Padroes_de_Campos_de_Texto.TextoFieldPadrao;
import Padroes_de_Fontes.CheckBoxPadrao;
import Padroes_de_Fontes.FormatadorPadrao;
import Padroes_de_Fontes.PasswordPadrao;
import Padroes_de_Fontes.RadioButtonPadrao;
import Padroes_de_Tela.TelaPadrao;
import Padroes_de_Textos.LabelPadrao;

public class TelaCadastro extends TelaPadrao{
	
	private TextoFieldPadrao loginCadastro, nomeCadastro, eMailCadastro;
	private PasswordPadrao senhaCadastro, comfirmarSenhaCadastro;
	private JFormattedTextField dataCadastro;
	private RadioButtonPadrao radioBotaoCadastro;
	private CheckBoxPadrao checkBoxCadastro;
	private JComboBox<String> comboBoxCadastro;
	private ButtonPadrao confimarCadastro, voltarCadastro;

	public TelaCadastro(String titulo) {
		super(titulo);
		itensDoCadastro();
		
		setVisible(true);
	}
	
	private void itensDoCadastro() {
		
		addLabelsCadastro();
		addCamposTextoCadastro();
		addBotaoRadioCadastro();
		addCheckBoxConfirmacaoCadastro();
		addBotoesCadastro();
		
	}
	
	private void addLabelsCadastro() {
		
		add(new LabelPadrao("Login", 15, 80, 45, 100, 40));
		add(new LabelPadrao("Nome Completo", 15, 80, 100, 150, 30));
		add(new LabelPadrao("Email", 15, 80, 145, 100, 40));
		add(new LabelPadrao("Data Nascimento", 15, 80, 200, 150, 25));
		add(new LabelPadrao("Senha", 15, 80, 250, 100, 30));
		add(new LabelPadrao("Confirmar Senha", 15, 80, 300, 150, 30));
	}
	
	private void addCamposTextoCadastro() {
		
		loginCadastro = new TextoFieldPadrao(80, 75, 260, 25);
		this.add(loginCadastro);
		
		nomeCadastro = new TextoFieldPadrao(80, 125, 260, 25);
		this.add(nomeCadastro);
		
		eMailCadastro = new TextoFieldPadrao(80, 175, 260, 25);
		this.add(eMailCadastro);
		
		try {
			MaskFormatter Data = new MaskFormatter("##/##/####");
			dataCadastro = new FormatadorPadrao(Data, 15, 80, 225, 120, 25);
			this.add(dataCadastro);
		} catch (ParseException e) {}
		
		senhaCadastro = new PasswordPadrao(20, 80, 275, 260, 25);
		this.add(senhaCadastro);
		
		comfirmarSenhaCadastro = new PasswordPadrao(20, 80, 330, 260, 25);
		this.add(comfirmarSenhaCadastro);
		
	}
	
	private void addBotaoRadioCadastro() {	
		
		ButtonGroup botaoGrupo = new ButtonGroup();
		
		radioBotaoCadastro = new RadioButtonPadrao("M", 15, 220, 225, 45, 25);
		RadioButtonPadrao radioButtonFeminino = new RadioButtonPadrao("F", 15, 290, 225, 50, 25);		
		
		botaoGrupo.add(radioButtonFeminino);
		botaoGrupo.add(radioBotaoCadastro);
		
		this.add(radioButtonFeminino);
		this.add(radioBotaoCadastro);
	}
	
	private void addCheckBoxConfirmacaoCadastro() {		
		checkBoxCadastro = new CheckBoxPadrao("  Confirmar Dados de Cadastro", 80, 370, 200, 25);
		checkBoxCadastro.setSelected(false);
		this.add(checkBoxCadastro);		
	}
	
	private void addBotoesCadastro() {	
		
		confimarCadastro = new ButtonPadrao("Confirmar", 80, 455, 200, 30);	
		this.add(confimarCadastro);
		
		voltarCadastro = new ButtonPadrao("Voltar", 320, 455, 200, 30);	
		this.add(voltarCadastro);
	}
	
	
	public static void main(String[] args) {
		new TelaCadastro("Cadastro");
	}

}
