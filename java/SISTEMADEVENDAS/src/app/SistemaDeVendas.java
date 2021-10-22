package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Carrinho;
import entities.Produto;

public class SistemaDeVendas {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int i = 0, quantidade = 0;
		int formaPagamento = 0;
		double valorTotalCompra = 0.0;
		double valorParcelado = 0.0;
		double valorComImposto = 0.0;
		double valorComDesconto = 0.0;
		char respostaBoleto;
		char respostaParcelas;
		char proximoPasso;
		char respostaIndecisa;
		double valorComImpostoParcela = 0.0;

		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("MOUSE    ", "G6-0", 20, 10));
		lista.add(new Produto("TECLADO", "G6-1", 150.00, 10));
		lista.add(new Produto("MONITOR", "G6-2", 1500.00, 10));
		lista.add(new Produto("CABO USB ", "G6-3", 20.00, 10));
		lista.add(new Produto("FONE DE OUVIDO", "G6-4", 50.00, 10));
		lista.add(new Produto("CARREGADOR ", "G6-5", 40.00, 10));
		lista.add(new Produto("ADAPTADOR", "G6-6", 25.00, 10));
		lista.add(new Produto("PELÍCULA", "G6-7", 20.00, 10));
		lista.add(new Produto("CABO HDMI", "G6-8", 40.00, 10));
		lista.add(new Produto("CASE  CELULAR", "G6-9", 30.00, 10));

		System.out.print(" ________________\n");
		System.out.print("| $   $                                  $   $ |\n");
		System.out.print("|   $        SISTEMA DE VENDAS ONLINE      $   |\n");
		System.out.print("|               CONTROL SYSTEMS 		         |\n");
		System.out.print("|$_$___________$_$_|\n");
		System.out.print("\n  >>      TUDO QUE VOCÊ PRECISA AQUI       << \n");
		System.out.print("\n\n");
		System.out.println("COD        PROD                        VALOR          ESTOQUE ");
		for (Produto p : lista) {

			System.out.println(p.toString());

		}

		Produto p1 = new Produto("MOUSE           ", "G0-0", 20, 10);
		Produto p2 = new Produto("TECLADO         ", "G6-1 ", 150.00, 10);
		Produto p3 = new Produto("MONITOR         ", "G6-2 ", 1500.00, 10);
		Produto p4 = new Produto("CABO USB        ", "G6-3", 20.00, 10);
		Produto p5 = new Produto("FONE DE OUVIDO  ", "G6-4", 50.00, 10);
		Produto p6 = new Produto("CARREGADOR      ", "G6-5", 40.00, 10);
		Produto p7 = new Produto("ADAPTADOR       ", "G6-6", 25.00, 10);
		Produto p8 = new Produto("PELÍCULA        ", "G6-7", 20.00, 10);
		Produto p9 = new Produto("CABO HDMI       ", "G6-8", 40.00, 10);
		Produto p10 = new Produto("CASE P/CELULAR", "G6-9", 30.00, 10);

		Carrinho c1 = new Carrinho(null, null, 0, 0, 0, 0);

		String[] produtosc = { "", "", "", "", "", "", "", "", "", "" };
		double[] valorc = { 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00 };
		int[] carrinho = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		String[] codigoc = { "G0-0", "G6-1 ", "G6-2 ", "G6-3 ", "G6-4 ", "G6-5 ", "G6-6 ", "G6-7 ", "G6-8 ", "G6-9 " };

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

		/*
		 * for (int posicao = 0; posicao < 9; posicao++) {
		 * System.out.println(produtos[posicao]); }
		 */
		int quantidadeSelecionada = 0;
		int posicao = 0;
		char respostaInicial = ' ';

		System.out.print("____\n");
		System.out.println("\nDESEJA CONTINUAR COMPRANDO? DIGITE S OU N:");
		respostaInicial = leia.next().toUpperCase().charAt(0);
		if (respostaInicial == 'S') {
			char resp = 'S';
			do {

				System.out.println("\nDIGITE O ÚLTIMO NÚMERO DO CÓDIGO: ");
				posicao = leia.nextInt();

				System.out.print(" ____\n");
				System.out.print("|_PRODUTOS DISPONÍVEIS NO ESTOQUE__|\n");
				System.out.print(" ____\n");
				System.out.print("|PRODUTO|COD.|VALOR UNIT.|ESTOQUE|\n");
				System.out.println(produtos[posicao].getProduto() + "    " + produtos[posicao].getCodigo() + "        "
						+ produtos[posicao].getValor() + "            " + produtos[posicao].getEstoque());

				System.out.print("\n\nDIGITE A QUANTIDADE QUE GOSTARIA COMPRAR: ");
				quantidadeSelecionada = leia.nextInt();

				produtos[posicao].comprar(quantidadeSelecionada);
				double auxvalor = produtos[posicao].getValor();
				int auxestoque = produtos[posicao].getEstoque();

				if (quantidadeSelecionada <= produtos[posicao].getEstoque() && quantidadeSelecionada > 0
						&& produtos[posicao].getEstoque() >= 0) {
					c1.compra(quantidadeSelecionada, auxvalor, auxestoque);
					produtosc[posicao] = produtos[posicao].getProduto();
					carrinho[posicao] = carrinho[posicao] + quantidadeSelecionada;
					valorc[posicao] = produtos[posicao].getValor();

					/*
					 * System.out.println(produtos[posicao].getProduto() + " " +
					 * produtos[posicao].getCodigo() + " " + produtos[posicao].getValor() + " " +
					 * produtos[posicao].getEstoque());
					 */

					for (posicao = 0; posicao < 9; posicao++) {
						System.out.println(produtos[posicao]);
					}

					for (posicao = 0; posicao < 10; posicao++) {
						if (carrinho[posicao] != 0 && valorc[posicao] != 0.00 && produtosc[posicao] != "") {
							System.out.print(" __\n");
							System.out.print("|_ITEN ADICIONADO NO CARRINHO DE COMPRAS|\n");
							System.out.print(" __\n");
							System.out.print("|PRODUTO|VALOR UNIT.|QUANTIDADE|\n");
							System.out.print("\n  " + produtosc[posicao] + "\t" + (valorc[posicao]) + "\t   "
									+ carrinho[posicao] + "\n");
						}
					}
				} else {
					System.out.println("Quantidade incompatível com o estoque!");

				}
				System.out.print("\n CONTINUAR COMPRANDO ? s/n ");
				resp = leia.next().toUpperCase().charAt(0);
			} while (resp == 'S');

			System.out.print(" ____\n");
			System.out.print("|__CARRINHO DE COMPRAS_|\n");

			for (posicao = 0; posicao < 10; posicao++) {
				if (carrinho[posicao] != 0 && valorc[posicao] != 0.00 && produtosc[posicao] != "") {
					System.out.print(" __\n");
					System.out.print("|PRODUTO|VALOR UNIT.|QUANTIDADE|\n");
					System.out.print(
							"\n" + produtosc[posicao] + "\t" + valorc[posicao] + "\t\t" + carrinho[posicao] + "\n");
				}

			}
			System.out.println("Valor total do carrinho: " + c1.getValorCarrinho());
			// FORMA DE PAGAMENTO
			System.out.print("\n____\n");
			System.out.print("\nDIGITE 1 PARA PAGAMENTO À VISTA\n");
			System.out.print("____\n");
			System.out.print("\nDIGITE 2 PARA PAGAMENTO EM CARTÃO\n");
			formaPagamento = leia.nextInt();

			if (formaPagamento == 1) {
				valorComDesconto = c1.getValorCarrinho() - (c1.getValorCarrinho() * 10) / 100;
				// valorComDesconto=c1.getValorCarrinho();
				System.out.print("\n >>> PARA PAGAMENTOS À VISTA VOCÊ GANHA 10% DE DESCONTO!! <<<\n");
				System.out.print("____\n");
				System.out.print("\nVALOR TOTAL DA COMPRA: R$" + valorComDesconto + "\n");
				System.out.print("____\n");
				System.out.print("\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? (S/N) ");
				respostaBoleto = leia.next().charAt(0);
				if (respostaBoleto == 'S' || respostaBoleto == 's') {

					System.out.print("\n\n____\n");
					System.out.print("\nNUMERO DO BOLETO: 36546845614684654868468468786460000000 64\n");
					System.out.print("____\n");
					System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
					proximoPasso = leia.next().charAt(0);

					if (proximoPasso == 's' || proximoPasso == 'S') {

						System.out.print("\n >> COMPRA REALIZADA COM SUCESSO! << ");
						System.out.print("\n\n___\n");
						System.out.print("\nNOTA FISCAL: 216546454654");
						System.out.print("\n___\n");
					} else if (proximoPasso == 'n' || proximoPasso == 'N') {
						System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
					} else if (proximoPasso != 's' || proximoPasso != 'S' || proximoPasso != 'n'
							|| proximoPasso != 'N') {
						System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
						System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");
						respostaIndecisa = leia.next().charAt(0);
						if (respostaIndecisa == 's' || respostaIndecisa == 'S') {
							System.out.print("/nVOCÊ SERÁ REDIRECIONADO A PÁGINA INICIAL");
							// como faz pra voltar pro início do programa?
						}
					}

				} else if (respostaBoleto == 'n' || respostaBoleto == 'N') {
					System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");

				} else if (respostaBoleto != 'N' || respostaBoleto != 'n' || respostaBoleto != 'S'
						|| respostaBoleto != 's') {
					System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
				}

			} else if (formaPagamento == 2) {
				System.out.print("\nGOSTARIA DE PARCELAR? ");
				respostaParcelas = leia.next().charAt(0);
				if (respostaParcelas == 's' || respostaParcelas == 'S') {
					System.out.print("\nSUA COMPRA SERÁ PARCELADA EM 2X\n");
					valorComImpostoParcela = c1.getValorCarrinho() + (c1.getValorCarrinho() * 15) / 100;
					valorParcelado = valorComImpostoParcela / 2;
					System.out.print(
							"\n >> PARA COMPRAS EFETUADAS E PARCELADAS NO CARTÃO DE CRÉDITO HAVERÁ ACRESCIMO DE 15% SOBRE O VALOR TOTAL DA COMPRA <<\n");
					System.out.print("\n____\n");
					System.out.print("\nVALOR DA PARCELA: R$" + (valorParcelado));
					System.out.print("\n____\n");
					System.out.print("\nVALOR TOTAL DA SUA COMPRA: " + (c1.getValorCarrinho()));
					System.out.print("\n____\n");
					System.out.print("\n\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? ");
					respostaBoleto = leia.next().charAt(0);
					if (respostaBoleto == 'n' || respostaBoleto == 'N') {
						System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
					} else if (respostaBoleto == 's' || respostaBoleto == 'S') {
						System.out.print("\n\n____\n");
						System.out.print("\nNUMERO DO BOLETO: 36546845614684654868468468786460000000 64\n");
						System.out.print("____\n");
						System.out.print("\n\n  >> COMPRA REALIZADA COM SUCESSO! << \n");
						System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
						(proximoPasso) = leia.next().charAt(0);
						if (proximoPasso == 's' || proximoPasso == 'S') {
							System.out.print("\n\n___\n");
							System.out.print("\nNOTA FISCAL: 216546454654");
							System.out.print("\n___\n");
						} else if (proximoPasso == 'n' || proximoPasso == 'N') {
							System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
						} else if (proximoPasso != 's' || proximoPasso != 'S' || proximoPasso != 'n'
								|| proximoPasso != 'N') {
							System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
							System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");
							(respostaIndecisa) = leia.next().charAt(0);
							if (respostaIndecisa == 's' || respostaIndecisa == 'S') {
								System.out.print("/nVOCÊ SERÁ REDIRECIONADO A PÁGINA INICIAL");
							}
						}
					} else if (respostaBoleto != 's' || respostaBoleto != 'S' || respostaBoleto != 'n'
							|| respostaBoleto != 'N') {
						System.out.print("DESCULPE, OPÇÃO INVÁLIDA!");
					}

				} else if (respostaParcelas == 'n' || respostaParcelas == 'N') {

					System.out.print("\nVALOR TOTAL DA COMPRA: R$" + (c1.getValorCarrinho()));
					System.out.print("\n\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? ");
					(respostaBoleto) = leia.next().charAt(0);
					if (respostaBoleto == 'n' || respostaBoleto == 'N') {
						System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
					} else if (respostaBoleto == 's' || respostaBoleto == 'S') {
						System.out.print("\n\n____\n");
						System.out.print("\nNUMERO DO BOLETO: 36546845614684654868468468786460000000 64\n");
						System.out.print("____\n");
						System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
						(proximoPasso) = leia.next().charAt(0);
						if (proximoPasso == 's' || proximoPasso == 'S') {

							System.out.print("\n\n  >> COMPRA REALIZADA COM SUCESSO! << ");
							System.out.print("\n\n___\n");
							System.out.print("\nNOTA FISCAL: 216546454654");
							System.out.print("\n___\n");
						}

						else if (proximoPasso == 'n' || proximoPasso == 'N') {
							System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
						} else if (proximoPasso != 's' || proximoPasso != 'S' || proximoPasso != 'n'
								|| proximoPasso != 'N') {
							System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
							System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");
							(respostaIndecisa) = leia.next().charAt(0);
							if (respostaIndecisa == 's' || respostaIndecisa == 'S') {
								System.out.print("/nVOCÊ SERÁ REDIRECIONADO A PÁGINA INICIAL");
							}
						}

					} else if (respostaBoleto != 's' || respostaBoleto != 'S' || respostaBoleto != 'n'
							|| respostaBoleto != 'N') {
						System.out.print("DESCULPE, OPÇÃO INVÁLIDA!");

					}

				} else if (respostaParcelas != 's' || respostaParcelas != 'S' || respostaParcelas != 'n'
						|| respostaParcelas != 'N') {
					System.out.print("DESCULPE, OPÇÃO INVÁLIDA!");

				}

			} else if (formaPagamento != 1 || formaPagamento != 2) {
				System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");

			}
		}

		else {
			System.out.println("\n >>>:  OBRIGADE PELA VISITA. VOLTE SEMPRE! :<<< ");
		}

	}

}