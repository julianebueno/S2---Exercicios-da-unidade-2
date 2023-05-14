import java.util.Scanner; //------------------------------------------ Figura 5

public class Calculadora {
	//metodos static são invocados diretamente da sua classe 
	static float somar (float a, float b) {
		return a + b;
	}
	static float multiplicar (float a, float b) {
		return a * b;
	}
		
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // leitor d teclado
		float x, y, z; // var locais
		
		System.out.println("Entre o valor de x: ");
		x = leitor.nextFloat();
		
		System.out.println("Entre o valor de y: ");
		y = leitor.nextFloat();
		
		z = Calculadora.somar(x, y);//metodo static: invocado diretamente da classe calculadora
		System.out.println("x + y = " + z);
		
		z = Calculadora.multiplicar(x, y);//metodo static: invocado diretamente da classe calculadora
		System.out.println("x * y = " + z);	
		leitor.close();
	}
}
