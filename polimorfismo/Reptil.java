package polimorfismo;

public class Reptil extends Animal {
	//atributo
	private String corEscama;
	
	//metodos de Animal
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
			System.out.println("Comendo Vegetais");
	}

	@Override
	public void emitirSom() {
			System.out.println("Som de Reptil");
	}

	//getters and setters
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	
}
