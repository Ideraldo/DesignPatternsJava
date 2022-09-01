package command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {

	private List<Usecase> comandos = new ArrayList<Usecase>();

	public void add(Usecase comando) {
		this.comandos.add(comando);
	}
	
	public void Executar() {		
		comandos.forEach(c -> c.Executar());

	}
	
}
