package observer;

import java.time.Instant;
import java.util.Map;

public class PayloadBuilder {
	private String acao;
	private Instant data;
	private Map<String, Object> dados;

	public PayloadBuilder addAcao(String acao){
		this.acao = acao;
		return this;
	}
	
	public PayloadBuilder addDados(Map<String, Object> dados){
		this.dados = dados;
		return this;
	}

	public PayloadBuilder setData(Instant data) {
		this.data = data;
		return this;
	}
	
	public Payload build() {
		if(this.acao == null) {
			throw new IllegalArgumentException("Acao é obrigatória!");
		}
		
		if(this.dados == null) {
			throw new IllegalArgumentException("Os dados não podem ser nulos!");
		}
		Payload payload = new Payload();
		payload.setAcao(acao);
		payload.setData(data);
		
		return payload;	
	}



}
