package factory;

public class EmissorSms implements Emissor{

	@Override
	public void enviar(String message) {
		//Metodo de enviar SMS
		System.out.println("Enviando SMS: " + message);	
	}

}
