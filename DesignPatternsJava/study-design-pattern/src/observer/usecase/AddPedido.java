package observer.usecase;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import command.Usecase;
import observer.Observer;
import observer.Payload;
import observer.PayloadBuilder;

public class AddPedido implements Usecase {
	private List<Observer> observers = new ArrayList<Observer>();
	private static final String ACAO = "ADD_PEDIDO";
	
	public void registrasInteressdado(Observer observer) {
		this.observers.add(observer);
	}
	
	
	
	public void Executar() {
		for(Observer observer : observers) {
			Map<String, Object> dados = new HashMap<String, Object>();	
			dados.put("Cliente", "Ideraldo");
			dados.put("Forma pagamento", "Credito");
			dados.put("Produto", "PS6");
			
			Payload payload = new PayloadBuilder()
					.addAcao(ACAO)
					.addDados(dados)
					.setData(Instant.now())
					.build();
			
			payload.setDados(dados);
			
			observer.notificar(payload);
		}
		
	}
	
	
}
