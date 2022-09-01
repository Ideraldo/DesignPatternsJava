package observer;

import observer.usecase.AddPedido;
import observer.usecase.DelPedido;

public class Application {

	public static void main(String[] args) {

		AddPedido addPedido = new AddPedido();

		addPedido.registrasInteressdado(new MailObserver());
		addPedido.registrasInteressdado(new NotificacaoObserver());

		addPedido.Executar();
		
		DelPedido delPedido = new DelPedido();
		
		delPedido.registrasInteressdado(new MailObserver());
		delPedido.registrasInteressdado(new NotificacaoObserver());
		delPedido.Executar();
		
	}

}
