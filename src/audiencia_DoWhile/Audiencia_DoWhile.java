package audiencia_DoWhile;

import java.util.Scanner;

public class Audiencia_DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int canal, canal_4 = 0, canal_5 = 0, canal_7 = 0, canal_12 = 0, totalCont = 0;
		
		do {
			System.out.println("Informe o número do canal.");
			canal = input.nextInt();
			
			if (canal ==4) {
				canal_4 = canal_4 + 1;
				totalCont = totalCont +1;
			}
			
			if (canal ==5) {
				canal_5 = canal_5 + 1;
				totalCont = totalCont +1;
			}
			
			if (canal ==7) {
				canal_7 = canal_7 + 1;
				totalCont = totalCont +1;
			}
			
			if (canal ==12) {
				canal_12 = canal_12 + 1;
				totalCont = totalCont +1;
			}
			
		} while (canal != 0);
		
		System.out.println();
		System.out.println("O total de pessoas assistindo televisão é, " + totalCont);
		System.out.println("A quantidade de pessoas assistindo o canal 4 é, " + canal_4);
		System.out.println("A quantidade de pessoas assistindo o canal 5 é, " + canal_5);
		System.out.println("A quantidade de pessoas assistindo o canal 7 é, " + canal_7);
		System.out.println("A quantidade de pessoas assistindo o canal 12 é, " + canal_12);
	}

}
