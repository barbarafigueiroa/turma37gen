package app;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class AnimalApp {

	public static void main(String[] args) {
		
	
		Animal cachorro1 = new Cachorro("domdom", 2, true);
		Animal cavalo1 = new Cavalo("Hulkão", 8, true);
		Animal preguica1 = new Preguica("tikinha", 3, true);
		
		
		System.out.println(cachorro1.getNome());
		cachorro1.correr();
		cachorro1.emitirSom();
		System.out.println(cavalo1.getNome());
		cavalo1.correr();
		cavalo1.emitirSom();
		
		//System.out.println(preguica1.ge
		
		
		

	}

}
