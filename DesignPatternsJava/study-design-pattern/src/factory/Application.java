package factory;

public class Application {
	public static void main(String[] args) {
		String mensagem = "O RuiBalaTensa te deu HS DENOVOOOOOO!";
				
		try{
			TipoEmissor tipoEmissor = TipoEmissor.FAX;
			Emissor emissor = EmissorFactory.factory(tipoEmissor);
			emissor.enviar(mensagem);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}


	
	}
}
