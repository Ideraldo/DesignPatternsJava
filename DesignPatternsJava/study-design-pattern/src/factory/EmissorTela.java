package factory;

public class EmissorTela implements Emissor{

	@Override
	public void enviar(String message) {
		System.out.println("Mostrando mensagem na tela: " + message);
	}

}
