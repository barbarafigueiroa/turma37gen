package app;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal macaco = new Animal("macaca-chita", 12, true);
		Animal domdom = new Cachorro("domdom", 2, true, true);
		Animal hulk = new Cavalo("Hulkão", 8, true, true);
		Animal tika = new Preguica("tikinha", 20, false, true);
		
		
		System.out.println(macaco.getNome());
		System.out.println(domdom.getIdade());
		System.out.println(hulk.getNome());
		System.out.println(tika.isEmiteSom());
		
		
		

	}

}
