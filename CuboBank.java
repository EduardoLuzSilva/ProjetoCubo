package projeto;

import java.util.Date;
import java.util.Scanner;

public class CuboBank {

	public static void main(String[] args) {

	Date DataHora = new Date();
	Scanner input = new Scanner(System.in);

	boolean sair = false; // Variável inicializada com False.

	// Instâncias:
	ContaCorrente cc = new ContaCorrente();
	ContaPoupanca cp = new ContaPoupanca();
	ContaPessoaJuridica pj = new ContaPessoaJuridica();

	while(!sair) { // While em Loop para acesso ao menu Principal.

	System.out.println("======================================================");
	System.out.println("***************** C U B O    B A N K *****************");
	System.out.println("======================================================");
	System.out.println("|                 Seja Bem Vindo!!!                  |");
	System.out.println("|                                                    |");
	System.out.println("-------------- Digite a Opção Desejada: --------------");
	System.out.println("|                                                    |");
	System.out.println("|             [1] Criar Conta Corrente               |");
	System.out.println("|             [2] Criar Conta Poupança               |");
	System.out.println("|             [3] Criar Conta Pessoa Jurídica        |");
	System.out.println("|             [4] Acessar Conta Corrente             |");
	System.out.println("|             [5] Acessar Conta Poupança             |");
	System.out.println("|             [6] Acessar Conta Pessoa Jurídica      |");
	System.out.println("|             [7] Sair                               |");
	System.out.println("|                                                    |");
	System.out.println("======================================================");

	int opcao = input.nextInt(); // Variável do Switch Case.

	switch (opcao) {  
	
		case 1:
		cc.setNumConta();
		cc.abrirConta();
		break;
	
		case 2:
		cp.setNumConta();
		cp.abrirConta();	
		break;
	
		case 3:
		pj.setNumConta();
		pj.abrirConta();
	
		case 4:
		cc.acessarCC();
		break;
	
		case 5:
		cp.acessarCP();
	
		break;
		case 6: 
		pj.acessarPJ();
	
		break;
		case 7:
			System.out.println("======================================================");
			System.out.println("***************** C U B O    B A N K *****************");
			System.out.println("======================================================");
			System.out.println("|  Obrigado por Utilizar nossas Soluções Financeiras.|");
			System.out.println("|                   Volte Sempre!!!                  |");
			System.out.println("|                  Sessão Encerrada.                 |");
			System.out.println("|                                                    |");
			System.out.println("| Acesso em: " + (DataHora.toString()));
			System.out.println("======================================================");
		sair = true;
		break;
		
		default:
		System.out.println("|                 Opção inválida                     |");
		break;

	}

	}	

	input.close();

	}

}