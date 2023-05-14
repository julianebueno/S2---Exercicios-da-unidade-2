public class Retangulo { //figura 4
	// atributos da classe : estado da classe
	float altura;
	float largura;

	// metodos da classe : comportamento da classe
	float calcularPerimetro() {
		float pm; // var local
		pm = 2 * altura + 2 * largura;
		return pm;
	}
	void imprimirDados() {
		float p; //var local
		p = calcularPerimetro(); //calcula o perimetro
		System.out.println("Retângulo: ");
		System.out.println("- altura :	" + altura);
		System.out.println("- largura :	" + largura);
		System.out.println("- perimetro :	" + p);
	}
// metodo principal - início de execução do programa	
	public static void main(String[] args) {
		System.out.println("Mundo dos retângulos");
		
		//objeto de retangulo retg1
		Retangulo retg1;		//refer. de objeto
		retg1 = new Retangulo();// instanciação da classe
		retg1.altura = 10;		// atribuição de valor
		retg1.largura = 20;		// atribuição de valor
		retg1.imprimirDados();  // invocação de metodo
		
		//objeto de retangulo retg2
		Retangulo retg2;		//refer. de objeto
		retg2 = new Retangulo();// instanciação da classe
		retg2.altura = 5;		// atribuição de valor
		retg2.largura = 15;		// atribuição de valor
		retg2.imprimirDados();  // invocação de metodo
	}
}