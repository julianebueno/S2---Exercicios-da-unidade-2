import java.util.Scanner; //------------------------------------------ Figura 7

public class Circulo {
//atributo da classe
	float raio;
	final static float PI = 3.1415f;//constante
	
	public Circulo (float raio) {	//construtor
		this.raio = raio;
	}
	
	//metodos da classe
	float calcularPerimetro() {
		return 2 * PI * this.raio;
	}
	void imprimirDados() {
		System.out.println("Círculo: ");
		System.out.println("- raio :	" + raio);
		System.out.println("- perímetro :	" + calcularPerimetro());
	}
	//metodo principal	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float raio;
		System.out.println("Mundo dos Círculos");
		System.out.println("Entre o valor do raio: ");
		raio = leitor.nextFloat();
		Circulo circ1 = new Circulo (raio);
		circ1.imprimirDados();
		System.out.println("--------------------");
		System.out.println("Entre o valor do raio: ");
		raio = leitor.nextFloat();
		Circulo circ2 = new Circulo (raio);
		circ2.imprimirDados();
		leitor.close();
	}
}