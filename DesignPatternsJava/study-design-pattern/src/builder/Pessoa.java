package builder;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String endereco;
	private String complemento;
	
	public Pessoa(String nome, String sobrenome, String endereco, String complemento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.complemento = complemento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
