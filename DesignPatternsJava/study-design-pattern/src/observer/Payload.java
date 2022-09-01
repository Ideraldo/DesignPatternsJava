package observer;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Payload {
	private String acao;
	private Instant data;
	private Map<String, Object> dados = new HashMap<String, Object>();
	
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public Instant getData() {
		return data;
	}
	public void setData(Instant data) {
		this.data = data;
	}
	public Map<String, Object> getDados() {
		return dados;
	}
	public void setDados(Map<String, Object> dados) {
		this.dados = dados;
	}
	
	
}
