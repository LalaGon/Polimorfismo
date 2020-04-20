package polimorfismo;

public class Ave extends Animal {
	//atributo
	private String corPena;

	//metodos de Animal
	@Override
	public void locomover() {
		System.out.println("Voando");	
	}

	@Override
	public void alimentar() {
			System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
			System.out.println("Som de Ave");
	}
	
	//getters and setters
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	//metodo de Ave
	public void fazerNinho() {
		System.out.println("Construindo Ninho");
	}
	
}
