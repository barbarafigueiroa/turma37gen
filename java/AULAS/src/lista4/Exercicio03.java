package lista4;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int[][] numero1  = new int [4][6];
				int[][] numero2 = new int [4][6];
				int[][] soma= new int [4][6];
				int[][] subtracao=new int[4][6];
				int linha = 0;
				 int coluna =0;

				for (linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						System.out.print("DIGITE VALORES PARA PREENCHER A MATRIZ: ");
					 (numero1[linha][coluna])=leia.nextInt();
					}
				}
				System.out.print("\n");
				for(linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						System.out.print(numero1[linha][coluna]+" ");
					}
					System.out.print("\n");
				}
				for(linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						System.out.print("DIGITE VALORES PARA PREENCHER A SEGUNDA MATRIZ: ");
						(numero2[linha][coluna])=leia.nextInt();
					}
				}
				for(linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						System.out.print(numero2[linha][coluna]+" ");
					}
					System.out.print("\n");
				}

				for (linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						soma [linha][coluna]=( numero1[linha][coluna] + numero2[linha][coluna] );
					}
				}


				for (linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						subtracao[linha][linha]=( numero1[linha][coluna] - numero2[linha][coluna] );
					}
				}
				System.out.print("\n_________________");
				System.out.print("\nSOMA MATRIZ: \n");
				for (linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						
						System.out.print(soma[linha][coluna]+" ");
					}
					
					System.out.print("\n");
				}
				System.out.print("\n_________________");
				System.out.print("\nDIFERENÇA MATRIZ: \n");
				
				for (linha=0; linha<4; linha++){
					for (coluna=0; coluna<6; coluna++){
						
						System.out.print(subtracao[linha][coluna]+" ");
					}
					System.out.print("\n");
				}
		

	}

}
