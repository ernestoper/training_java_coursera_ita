package imc;
import java.util.*;


public class imc {
	
	//IMC = peso (quilos) / (altura * altura (metros));
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese seu nome:");
		String nome = scan.next();
		System.out.println("Ingresse seu peso:");
		double peso = scan.nextDouble();
		System.out.println("Ingresse sua altura em metros:");
		double altura = scan.nextDouble();
		scan.close();
		paciente paciente  = new paciente(peso, altura);
		System.out.println("IMC de "+nome+" é:" +paciente.calcularIMC());

		
		System.out.println("\nDiagnóstico de "+nome+" é: " +paciente.diagnostico());
		
		
	}
	


}
