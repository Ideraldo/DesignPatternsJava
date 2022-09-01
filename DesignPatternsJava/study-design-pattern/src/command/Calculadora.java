package command;

public class Calculadora implements Usecase{

	private float x;
	private float y;
	
	public Calculadora(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void Executar() {
		float soma = x + y;
		System.out.println(soma);
	}

}
