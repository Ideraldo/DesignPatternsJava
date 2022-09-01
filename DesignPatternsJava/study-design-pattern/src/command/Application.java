package command;

public class Application {

	public static void main(String[] args) {
		
		ListaDeComandos listaComandos = new ListaDeComandos();
		listaComandos.add(new Calculadora(5,6));
		listaComandos.add(new Acelerador());
	}

}
