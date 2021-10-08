package aplication;

import entities.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("PXL-0301", "CELTA", "GM");//String placa, String modelo, String fabricante
		Carro carro2 = new Carro();

		carro2.setPlaca("BBC-0351"); //set eu altero uma valor
		carro1.setPlaca("PRP-0205");
		
		//System.out.println(carro1.getModelo() + " " + carro1.getPlaca()); //get eu puxo uma informação
		//System.out.println(carro2.getModelo() + " " + carro2.getPlaca());
		
		carro1.ligarCarro();
		carro1.andarCarro();
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.desacelerar();
		carro1.descerMarcha();
		carro1.desacelerar();
		carro1.freio();
		carro1.pararCarro();
		carro1.desligarCarro();
		
		
	}

}
