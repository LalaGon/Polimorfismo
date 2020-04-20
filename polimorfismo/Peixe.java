package polimorfismo;

public class Peixe extends Animal{
	//atributo
	private String corEscama;
	
	//metodos de Animal
	@Override
	public void locomover() {
			System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substancias");
	}

	@Override
	public void emitirSom() {
			System.out.println("Peixe nao faz Som");
	}
	
	//getters and setters
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	//metodo de Peixe
	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	}
	

}
