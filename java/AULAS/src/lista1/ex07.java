package lista1;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		int coeficienteA = 0;
		int coeficienteB = 0;
		int coeficienteC = 0;
		int coeficienteD = 0;
		int coeficienteE = 0;
		int coeficienteF = 0;
		int resultadoX = 0;
		int resultadoY = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("DIGITE DO COEFICIENTE A: ");
		coeficienteA = leia.nextInt();
		System.out.println("DIGITE DO COEFICIENTE B: ");
		coeficienteB = leia.nextInt();
		System.out.println("DIGITE DO COEFICIENTE C: ");
		coeficienteC = leia.nextInt();
		System.out.println("DIGITE DO COEFICIENTE D: ");
		coeficienteD = leia.nextInt();
		System.out.println("OPERAÇÃO A SER RESOLVIDA: ax + by = c_|_dx + ey = f");
		
		resultadoX = ((coeficienteC * coeficienteE) - (coeficienteB * coeficienteF)) / ((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD));
		resultadoY = ((coeficienteA * coeficienteF) - (coeficienteC * coeficienteD)) / ((coeficienteA * coeficienteE) - (coeficienteB * coeficienteD));
		
		System.out.println("O RESULTADO DE X É: " + resultadoX);
		System.out.println("O RESULTADO DE X É: " + resultadoY);

	}

}
