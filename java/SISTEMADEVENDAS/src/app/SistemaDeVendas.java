package app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entities.Carrinho;
import entities.Produto;

public class SistemaDeVendas {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.print("     ______________________________________________\n");
		System.out.print("    | $   $                                  $   $ |\n");
		System.out.print("    |   $        SISTEMA DE VENDAS ONLINE      $   |\n");
		System.out.print("    |               37GEN COMÉRCIOS LTDA           |\n");
		System.out.print("    |_$___$__________________________________$___$_|\n");
		System.out.print("\n     >>      TUDO QUE VOCÊ PRECISA AQUI      << \n");
		System.out.print(" _______________________________________________________\n");
		System.out.print("|________________>> ITENS DISPONÍVEIS <<________________|\n");
		System.out.print(" _______________________________________________________\n");
		System.out.print("|____COD.____|___PRODUTO____|__VALOR UNIT.__|__ESTOQUE__|\n");

		Produto p1 = new Produto("MOUSE           ", "G0-0", 20, 10);
		Produto p2 = new Produto("TECLADO         ", "G6-1 ", 150.00, 20);
		Produto p3 = new Produto("MONITOR         ", "G6-2 ", 1500.00, 30);
		Produto p4 = new Produto("CABO USB        ", "G6-3", 20.00, 30);
		Produto p5 = new Produto("FONE DE OUVIDO  ", "G6-4", 50.00, 10);
		Produto p6 = new Produto("CARREGADOR      ", "G6-5", 40.00, 10);
		Produto p7 = new Produto("ADAPTADOR       ", "G6-6", 25.00, 10);
		Produto p8 = new Produto("PELÍCULA        ", "G6-7", 20.00, 10);
		Produto p9 = new Produto("CABO HDMI       ", "G6-8", 40.00, 10);
		Produto p10 = new Produto("CASE P/ CELULAR", "G6-9", 30.00, 10);

		Carrinho c1 = new Carrinho(null, null, 0, 0, 0, 0);

		String[] produtosc = { "", "", "", "", "", "", "", "", "", "" };
		double[] valorc = { 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00 };
		int[] carrinho = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		String[] codigoc = { "G0-0", "G6-1 ", "G6-1 ", "G6-1 ", "G6-1 ", "G6-1 ", "G6-1 ", "G6-1 ", "G6-1 ", "G6-1 " };

		Produto produtos[] = new Produto[10];

		produtos[0] = p1;
		produtos[1] = p2;
		produtos[2] = p3;
		produtos[3] = p4;
		produtos[4] = p5;
		produtos[5] = p6;
		produtos[6] = p7;
		produtos[7] = p8;
		produtos[8] = p9;
		produtos[9] = p10;

		for (int posicao = 0; posicao < 9; posicao++) {
			System.out.println(produtos[posicao]);
		}

		int quantidadeSelecionada = 0;
		int posicao = 0;
		char respostaInicial = ' ';

		System.out.print("________________________________________________________\n");
		System.out.println("\nDESEJA CONTINUAR COMPRANDO? DIGITE S OU N:");
		respostaInicial = leia.next().toUpperCase().charAt(0);
		if (respostaInicial == 'S') {
			char resp = 'S';
			do {

				System.out.println("\nDIGITE O ÚLTIMO NÚMERO DO CÓDIGO: ");
				posicao = leia.nextInt();

				/*System.out.print(" __________________________________________________________\n");
				System.out.print("|____________PRODUTOS DISPONÍVEIS NO ESTOQUE_______________|\n");
				System.out.print(" __________________________________________________________\n");
				System.out.print("|___PRODUTO____|____COD.____|__VALOR UNIT.__|____ESTOQUE___|\n");
				System.out.println(produtos[posicao].getProduto() + "    " + produtos[posicao].getCodigo() + "        "
						+ produtos[posicao].getValor() + "            " + produtos[posicao].getEstoque());*/

				System.out.print("\n\nDIGITE A QUANTIDADE QUE GOSTARIA COMPRAR: ");
				quantidadeSelecionada = leia.nextInt();

				produtos[posicao].comprar(quantidadeSelecionada);
				double auxvalor = produtos[posicao].getValor();
				int auxestoque = produtos[posicao].getEstoque();

				if (quantidadeSelecionada <= produtos[posicao].getEstoque() && quantidadeSelecionada > 0 && produtos[posicao].getEstoque() >= 0) {
					c1.compra(quantidadeSelecionada, auxvalor, auxestoque);
					produtosc[posicao] = produtos[posicao].getProduto();
					carrinho[posicao] = carrinho[posicao] + quantidadeSelecionada;
					valorc[posicao] = produtos[posicao].getValor();

					/*
					 * System.out.println(produtos[posicao].getProduto() + " " +
					 * produtos[posicao].getCodigo() + " " + produtos[posicao].getValor() + " " +
					 * produtos[posicao].getEstoque());
					 */

					for (posicao = 0; posicao < 10; posicao++) {
						if (carrinho[posicao] != 0 && valorc[posicao] != 0.00 && produtosc[posicao] != "") {
							System.out.print(" ________________________________________________\n");
							System.out.print("|_____ITEN ADICIONADO NO CARRINHO DE COMPRAS_____|\n");
							System.out.print(" ________________________________________________\n");
							System.out.print("|___PRODUTO____|__VALOR UNIT.__|____QUANTIDADE___|\n");
							System.out.print("\n  " + produtosc[posicao] + "\t" + (valorc[posicao] *quantidadeSelecionada) + "\t   "+ carrinho[posicao] + "\n");
						}
					}
				} else {
					System.out.println("Quantidade incompatível com o estoque!");

				}
				System.out.print("\nCONTINUAR COMPRANDO ? s/n ");
				resp = leia.next().toUpperCase().charAt(0);
			} while (resp == 'S');

			System.out.print(" __________________________________________________________\n");
			System.out.print("|_____________________CARRINHO DE COMPRAS__________________|\n");

			for (posicao = 0; posicao < 10; posicao++) {
				if (carrinho[posicao] != 0 && valorc[posicao] != 0.00 && produtosc[posicao] != "") {
					System.out.print(" ________________________________________________\n");
					System.out.print("|___PRODUTO____|__VALOR UNIT.__|____QUANTIDADE___|\n");
					System.out.print("\n" + produtosc[posicao] +"\t" + valorc[posicao] + "\t\t" + carrinho[posicao] + "\n");
				}

			}
		} else {
			System.out.println("\n >>>:  OBRIGADA PELA VISITA. VOLTE SEMPRE! :<<< ");
		}

	}

}