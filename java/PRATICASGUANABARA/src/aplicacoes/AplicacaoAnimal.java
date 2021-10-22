package aplicacoes;

import entities.Arara;
import entities.Ave;
import entities.Cachorro;
import entities.Cobra;
import entities.GoldFish;
import entities.Kangaroo;
import entities.Mamifero;
import entities.Peixe;
import entities.Reptil;
import entities.Tartaruga;

public class AplicacaoAnimal {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Kangaroo k = new Kangaroo();
		Cachorro c = new Cachorro();
		Cobra s = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish gf = new GoldFish();
		Arara aa = new Arara();
		
		
		
		/*m.setPeso(200.6);
		m.setCorPelo("dourados");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println("---------------------------------------------");
		r.setPeso(60.5);
		r.setCorEscama("verde");
		r.alimentar();
		r.locomover();
		r.emitirSom();
		System.out.println("---------------------------------------------");
		p.setPeso(60.5);
		p.setCorEscama("vermelho");
		p.alimentar();
		p.locomover();
		p.emitirSom();
		System.out.println("---------------------------------------------");
		a.setPeso(60.5);
		a.setCorPena("Amarelo");
		a.alimentar();
		a.locomover();
		a.emitirSom();
		*/

		c.locomover();
		k.locomover();
		s.locomover();
		gf.locomover();
		aa.locomover();
		t.locomover();
		System.out.println("---------------------------------------------");
		c.emitirSom();
		k.emitirSom();
		s.emitirSom();
		gf.emitirSom();
		aa.emitirSom();
		t.emitirSom();
		
	
	}

}
