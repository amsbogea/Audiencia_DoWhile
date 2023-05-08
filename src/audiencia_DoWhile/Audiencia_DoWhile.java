package audiencia_DoWhile;

import java.util.Scanner;

public class Audiencia_DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int canal,  pessoas, totalPessoas = 0;
		
		double percCanal_4 = 0, percCanal_5 = 0, percCanal_7 = 0, percCanal_12 = 0;
		
		do {
			System.out.println("Digite o número do canal (4, 5, 7 ou 12) ou 0 para sair: ");
			canal = input.nextInt();
			
			if (canal == 0) {
	           break;
	        }
			
			System.out.println("Informe quantas pessoas está assistindo.");
			pessoas = input.nextInt();
			
			if (canal == 4) {
				percCanal_4 += pessoas;
            } else if (canal == 5) {
            	percCanal_5 += pessoas;
            } else if (canal == 7) {
            	percCanal_7 += pessoas;
            } else if (canal == 12) {
            	percCanal_12 += pessoas;
            }
			
			totalPessoas += pessoas;

			
		} while (canal != 0);
		
						
						
		System.out.println("\nRelatório de Audiência");
        System.out.println("----------------------");

        if (totalPessoas == 0) {
            System.out.println("Não foi registrada nenhuma audiência.");
        } else {
        	percCanal_4 = (percCanal_4 / totalPessoas) * 100;
        	percCanal_5 = (percCanal_5 / totalPessoas) * 100;
        	percCanal_7 = (percCanal_7 / totalPessoas) * 100;
			percCanal_12 = (percCanal_12 / totalPessoas) * 100;

			System.out.println("\nTotal de Audiência = " + totalPessoas  );
	        System.out.println("\n" );
            System.out.printf("Canal 4: %.2f%%\n", percCanal_4);
            System.out.printf("Canal 5: %.2f%%\n", percCanal_5);
            System.out.printf("Canal 7: %.2f%%\n", percCanal_7);
            System.out.printf("Canal 12: %.2f%%\n",percCanal_12);
        }

        input.close();
    }
	

}
