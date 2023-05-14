public class Cambio { //---------------------------------------------- Figura 6
	static float cotacaoDolar = 4.0f; //Atributo static
	
	float converteDolar (float valorReal) {
		return valorReal / cotacaoDolar;
	}
	float converteReal (float valorDolares) {
		return valorDolares * cotacaoDolar;
	}
		
	public static void main(String[] args) {
		//float valorDolar;
		//float valorReal;
		
		Cambio c1 = new Cambio(); // cria o objt c1 da classe Cambio
		
		//Apresenta cotações
		System.out.printf("\n == U$ 1,00 vale R$ %.2f\n", Cambio.cotacaoDolar);
		System.out.printf("U$ 10,00 = R$ %.2f\n", c1.converteReal(10f));
		System.out.printf("R$ 10,00 = U$ %.2f\n", c1.converteDolar(10f));
		
		Cambio c2 = new Cambio(); // cria o objt c2 da classe Cambio
		
		Cambio.cotacaoDolar = 5f; //alteração do atributo na clase
		
		//Apresenta cotações
		System.out.printf("\n == U$ 1,00 vale R$ %.2f\n", Cambio.cotacaoDolar);
		System.out.printf("U$ 10,00 = R$ %.2f\n", c2.converteReal(10f));
		System.out.printf("R$ 10,00 = U$ %.2f\n", c2.converteDolar(10f));
		
		
	}
}
