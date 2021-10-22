package aplicacoes;

import entities.Aaluno;
import entities.Ffuncionario;
import entities.Ppessoa;
import entities.Pprofessor;

public class AaplicationPpessoa {

	public static void main(String[] args) {
		
		/*Ppessoa p1 = new Ppessoa("Barbara", 28, "F");
		Aaluno p2 = new Aaluno("Lucas", 27, "M", 200563, true);
		Pprofessor p3 = new Pprofessor("Jessica", 18, "E","English", 5600.80);
		Ffuncionario p4 = new Ffuncionario("Maria", 65, "F", "Diretora Executiva", true);
		
		p1.fazerAniver();
		System.out.print(p1.getIdade());*/
		
		Ppessoa p1 = new Ppessoa();
		Aaluno p2 = new Aaluno();
		Pprofessor p3 = new Pprofessor();
		Ffuncionario p4 = new Ffuncionario();
		
		p1.setNome("Bruna");
		p2.setNome("Luiza");
		p3.setNome("Céu");
		p4.setNome("Catarina");
		
		System.out.println("-----------------------------------------");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		p1.setIdade(30);
		p1.setSexo("E");
		p2.setIdade(50);
		p2.setSexo("F");
		p3.setIdade(25);
		p3.setSexo("F");
		p4.setIdade(12);
		p4.setSexo("E");
		
		System.out.println("-----------------------------------------");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
		

	}

}
