package exerciciosJava;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println ("Seu nome completo é: " + nomeCompleto);

		// exercício para ler um dado específico 
		
		System.out.println ("Digite seu  primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println ("Seu primeiro nome é: " + primeiroNome);
		
		// ler número inteiro 
		
		System.out.println ("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println ("Sua idade é:  " + idade);
		
		System.out.println ("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println ("Sua altura é :  " + altura); 
		
		// LENDO VÁRIOS DADOS DE UMA ÚNICA VEZ!
		
		System.out.println ("Informe o nome curso em que está matriculado, nome da Faculdade, período que está cursando, e previsão de término do curso");
		String nomeCurso = scan.next();
		String nomeFaculdade = scan.next();
		int periodoCurso = scan.nextInt();
		int fimCurso = scan.nextInt();
		
		System.out.println (" Informações Acadêmicas: ");
		System.out.println (" Nome do curso: " + nomeCurso);
		System.out.println (" Nome da Instituição de Ensino: " + nomeFaculdade);
		System.out.println (" Período que está cursando atualmente: " + periodoCurso);
		System.out.println (" Previsão de ano de término do curso: " + fimCurso);
		
		
	}

}
