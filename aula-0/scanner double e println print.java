import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
		double precoLaranja = entrada.nextDouble();
		double precoUva = entrada.nextInt();
		
		System.out.println(precoLaranja + precoUva);
		
		// OU
		
		double precoFinal = precoLaranja + precoUva;
		
		System.out.print(precoFinal);
		
	}
}