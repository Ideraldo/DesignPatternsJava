package builder;

public class PessoaBuilder {

	private String nome;
	private String sobrenome;
	private String endereco;
	private String complemento;
	
	public PessoaBuilder addNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public PessoaBuilder addSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		return this;
	}
	
	public PessoaBuilder addEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}
	
	public PessoaBuilder addComplemento(String complemento) {
		this.complemento = complemento;
		return this;
	}
	
	
	public Pessoa build() {
		return new Pessoa(nome, sobrenome, endereco, complemento);
	}
	
}
