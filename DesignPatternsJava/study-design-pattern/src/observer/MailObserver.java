package observer;

public class MailObserver implements Observer{

	@Override
	public void notificar(Payload payload) {
		System.out.println("Notificando.. ");
		System.out.println("Acao recebida: " + payload.getAcao());
		
		//If com o getAcao pra ver se é DEL_PEDIDO ou ADD_PEDIDO
		if(payload.getAcao().equals("DEL_PEDIDO")) {
			System.out.println("Data: " + payload.getData());
			System.out.println("Você deletou a compra de um: " + payload.getDados().get("Produto"));	
		}
		
		if(payload.getAcao().equals("ADD_PEDIDO")) {
			System.out.println("Data: " + payload.getData());
			System.out.println("Você comprou um: " + payload.getDados().get("Produto"));	
		}
	}

}
