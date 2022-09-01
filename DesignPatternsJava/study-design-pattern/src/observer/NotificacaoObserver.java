package observer;

public class NotificacaoObserver implements Observer{

	@Override
	public void notificar(Payload payload) {
		System.out.println("Notificando.. ");
		System.out.println("Acao recebida: " + payload.getAcao());
		System.out.println("Data: " + payload.getData());		
		
		if(payload.getAcao().equals("DEL_PEDIDO")) {
			System.out.println("Olá!: " + payload.getDados().get("Cliente") + "!");
			System.out.println("Parabéns pela sua compra. PRODUTO: " + payload.getDados().get("Produto"));			
		}
		
		if(payload.getAcao().equals("ADD_PEDIDO")) {
			System.out.println("Data: " + payload.getData());
			System.out.println("Você comprou um: " + payload.getDados().get("Produto"));	
		}
		
	}

}
