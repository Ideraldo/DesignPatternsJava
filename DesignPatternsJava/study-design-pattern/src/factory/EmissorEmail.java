package factory;

public class EmissorEmail implements Emissor{

	@Override
	public void enviar(String message) {
		//Metodo de enviar email
		System.out.println("Enviando email: " + message);
	}

}
