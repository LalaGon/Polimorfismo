package polimorfismo;

public class Canguru extends Mamifero {
	
	//sobrepondo o locomover de Mamifero
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}

}
