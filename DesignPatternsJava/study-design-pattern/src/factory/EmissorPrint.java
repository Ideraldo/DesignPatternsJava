package factory;

public class EmissorPrint implements Emissor{

	@Override
	public void enviar(String message) {
		//Metodo de enviar email
		System.out.println("Imprimindo mensagem: " + message);		
	}

}
