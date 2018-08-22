package Dados_do_Usuario;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class Arquivo {
	
	private XStream xstream = new XStream(new DomDriver());
	private File arquivo = new File("MalheteOuro.xml");
	
	public void salvar(CentralDados dados) {
		
		String xml = xstream.toXML(dados);
		
		try {
			if (!arquivo.exists())
				arquivo.createNewFile();
			PrintWriter gravar = new PrintWriter(arquivo);
			gravar.print(xml);
			gravar.close();		
		} catch (IOException e) {	
			e.printStackTrace();
		}	
	}
	
	public CentralDados recuperar() {
		try {
			if (arquivo.exists()) {
				FileInputStream file = new FileInputStream(arquivo);
				return (CentralDados)xstream.fromXML(file);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		return new CentralDados();
	}
}
