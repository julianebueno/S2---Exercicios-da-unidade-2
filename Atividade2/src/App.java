public class App { //estrutura de dados: vetores e matrizes
	public static void main(String[] args) {
//-----------------------------------------------------------------------------		
		System.out.println("------------------------ Figura 14 -");	//FIGURA 14
		int [] x = new int[] {20,4,60,-15};
		
			for (int i = 0; i < 4; i++) {
				System.out.print(x[i] + " ");
			}
			System.out.println("\nfim ");
//-----------------------------------------------------------------------------		
		System.out.println("------------------------ Figura 15 -");	//FIGURA 15
		String [] estudantes = new String[] {"Maria", "Pedro", "João"};
		
		for (String estudante : estudantes) {
			System.out.println(estudante);
		}
//-----------------------------------------------------------------------------		
		System.out.println("------------------------ Figura 16 -");	//FIGURA 16
		final int LIN = 3;
		final int COL = 4;
		
		int [][] mat = new int[LIN][COL];
		int valor;
		
		for (int i = 0; i < LIN; i++) {
			for (int j = 0; j < COL; j++) {
				valor = i + j;
				mat[i][j] = valor;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}