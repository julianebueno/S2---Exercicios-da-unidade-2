public class App { // Comandos de desvio e repetição
	public static void main(String[] args) {
//-----------------------------------------------------------------------------			
		System.out.println("------------------------ Figura 09 -"); //FIGURA 09
		int idade = 26;
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
//-----------------------------------------------------------------------------	
		System.out.println("------------------------ Figura 10 -"); //FIGURA 10
		int escolha = 3;
		switch (escolha) {
		case 1:
			System.out.println("Escolha 1 selecionada");
			break;
		case 2:
			System.out.println("Escolha 2 selecionada");
			break;
		case 3:
			System.out.println("Escolha 3 selecionada");
			//break;
		default:
			System.out.println("Escolha opção selecionada");
			break;
		}
//-----------------------------------------------------------------------------			
		System.out.println("------------------------ Figura 11 -"); //FIGURA 11
		int i = 1;
		int soma = 0;
		while (i <= 3) {
			soma = soma + i;
			i++;
		}
		System.out.println("Soma = " + soma);
//-----------------------------------------------------------------------------		
		System.out.println("------------------------ Figura 12 -"); //FIGURA 12
		//int soma = 0;
		soma = 0; // var já criada, só zerada aki
		for (int j = 1; j <= 3; j++) {
			soma = soma + j;
		}
		System.out.println("Soma = " + soma);
//-----------------------------------------------------------------------------		
		System.out.println("------------------------ Figura 13 -"); //FIGURA 13
		   for (int k = 1; k <= 20; k+=3) { // 1, 4, 7, 10, 13, 16, 19	
		      if (k % 2 == 1) { // se é número ímpar: resto de i por 2 = 1    
		         continue;      // interrompe e vai para a condição 
		      }
		      System.out.println(k + " ");
		   }
		   System.out.println("Fim 1\n\n");
		   
		   for (int k = 1; k <= 20; k+=3) { // 1, 4, 7, 10, 13, 16, 19	
		      if (k % 5 == 0) { // se múltiplo de 5: resto de i por 5 = 0	
		         break;         // interrompe e sai da repetição
		      }
		      System.out.println(k + " ");
		   }
		   System.out.println("Fim 2");
	}

}
