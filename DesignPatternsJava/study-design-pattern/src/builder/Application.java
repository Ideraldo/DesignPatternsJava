package builder;

public class Application {

	public static void main(String[] args) {
		Pessoa pessoa = new PessoaBuilder()
				.addNome("Antonio Carlos")
				.addSobrenome("Carlos")
				.addEndereco("Avenida dos Palmares")
				.addComplemento(null)
				.build();
		System.out.println(pessoa.getNome() + " " + pessoa.getSobrenome() + " MORA NO ENDERECO: " + pessoa.getEndereco() + " COMPLEMENTO: " + pessoa.getComplemento());
	}

}
