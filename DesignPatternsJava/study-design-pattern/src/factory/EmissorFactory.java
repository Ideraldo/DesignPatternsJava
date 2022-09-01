package factory;

public class EmissorFactory {

	public static Emissor factory(TipoEmissor tipo) {				
		switch(tipo) {
			case SMS:
				return new EmissorSms();
			case EMAIL:
				return new EmissorEmail();
			case PRINT:
				return new EmissorPrint();
			case TELA:
				return new EmissorTela();
			default:
				throw new IllegalArgumentException("Emissor inválido: " + tipo);
		}
	}
	
}
