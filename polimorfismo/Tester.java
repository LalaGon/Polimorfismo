package polimorfismo;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
	
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		
		System.out.println("Aluna: Laís G. Senna");
		System.out.println("\n");
		System.out.println("---Mamifero---");
	
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		float peso = input.nextFloat();
		
		m.setPeso(peso);
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int idade = input1.nextInt();
		
		m.setIdade(idade);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Digite o total de membros: ");
		int membros = input2.nextInt();
		
		m.setMembros(membros);
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Digite a cor: ");
		String cor = input3.nextLine();
		
		m.setCorPelo(cor);
		
		System.out.println("\nPerfil do Mamifero:");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println("Peso: " + m.getPeso());
		System.out.println("Idade: " + m.getIdade());
		System.out.println("Membros: " + m.getMembros());
		System.out.println("Cor: " + m.getCorPelo());
		System.out.println("\n");
		
		System.out.println("---Reptil---");
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		float peso1 = input4.nextFloat();
		
		r.setPeso(peso1);
		
		Scanner input5 = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int idade1 = input5.nextInt();
		
		r.setIdade(idade1);
		
		Scanner input6 = new Scanner(System.in);
		System.out.println("Digite o total de membros: ");
		int membros1 = input6.nextInt();
		
		r.setMembros(membros1);
		
		Scanner input7 = new Scanner(System.in);
		System.out.println("Digite a cor: ");
		String cor1 = input7.nextLine();
		
		r.setCorEscama(cor1);
		
		System.out.println("\nPerfil do Reptil:");
		r.alimentar();
		r.locomover();
		r.emitirSom();
		System.out.println("Peso: " + r.getPeso());
		System.out.println("Idade: " + r.getIdade());
		System.out.println("Membros: " + r.getMembros());
		System.out.println("Cor: " + r.getCorEscama());
		System.out.println("\n");
		
		System.out.println("---Peixe---");
		
		Scanner input8 = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		float peso2 = input8.nextFloat();
		
		p.setPeso(peso2);
		
		Scanner input9 = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int idade2 = input9.nextInt();
		
		p.setIdade(idade2);
		
		Scanner input10 = new Scanner(System.in);
		System.out.println("Digite o total de membros: ");
		int membros2 = input10.nextInt();
		
		p.setMembros(membros2);
		
		Scanner input11 = new Scanner(System.in);
		System.out.println("Digite a cor: ");
		String cor2 = input11.nextLine();
		
		p.setCorEscama(cor2);
		
		System.out.println("\nPerfil do Peixe:");
		p.alimentar();
		p.locomover();
		p.emitirSom();	
		System.out.println("Peso: " + p.getPeso());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Membros: " + p.getMembros());
		System.out.println("Cor: " + p.getCorEscama());
		System.out.println("\n");
		
		System.out.println("---Ave---");
		
		Scanner input12 = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		float peso3 = input12.nextFloat();
		
		a.setPeso(peso3);
		
		Scanner input13 = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int idade3 = input13.nextInt();
		
		a.setIdade(idade3);
		
		Scanner input14 = new Scanner(System.in);
		System.out.println("Digite o total de membros: ");
		int membros3 = input14.nextInt();
		
		a.setMembros(membros3);
		
		Scanner input15 = new Scanner(System.in);
		System.out.println("Digite a cor: ");
		String cor3 = input15.nextLine();
		
		a.setCorPena(cor3);
		
		System.out.println("\nPerfil da Ave:");
		a.alimentar();
		a.locomover();
		a.emitirSom();
		System.out.println("Peso: " + a.getPeso());
		System.out.println("Idade: " + a.getIdade());
		System.out.println("Membros: " + a.getMembros());
		System.out.println("Cor: " + a.getCorPena());
		System.out.println("\n");
		
		System.out.println("---Canguru---");
		
		Scanner input16 = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		float peso4 = input16.nextFloat();
		
		c.setPeso(peso4);
		
		Scanner input17 = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int idade4 = input17.nextInt();
		
		c.setIdade(idade4);
		
		Scanner input18 = new Scanner(System.in);
		System.out.println("Digite o total de membros: ");
		int membros4 = input18.nextInt();
		
		c.setMembros(membros4);
		
		Scanner input19 = new Scanner(System.in);
		System.out.println("Digite a cor: ");
		String cor4 = input19.nextLine();
		
		c.setCorPelo(cor4);
		
		System.out.println("\nPerfil do Canguru:");
		c.alimentar();
		c.locomover();
		c.emitirSom();
		System.out.println("Peso: " + c.getPeso());
		System.out.println("Idade: " + c.getIdade());
		System.out.println("Membros: " + c.getMembros());
		System.out.println("Cor: " + c.getCorPelo());
		System.out.println("\n");
		
	}

}
