package polimorfismo;

public class Mamifero extends Animal {
	//atributo
	private String corPelo;
	
	//metodos de Animal
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamifero");
	}

	//getters and setters
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
}
