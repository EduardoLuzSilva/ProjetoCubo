package projeto;

import java.util.Date;
import java.util.Scanner;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(String dtNasc) {
		
	}

	public ContaPoupanca() {
	}

	Date DataHora = new Date();
	Scanner input = new Scanner(System.in);

	
	@Override
	public void abrirConta() {
		this.setSaldoCP(0);
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("======================================================");
		System.out.println("|                 Seja Bem Vindo!!!                  |");
		System.out.println("|          Vamos criar sua Conta Poupança.           |");
		System.out.println("|                 C A D A S T R O                    |");
		System.out.println("|                                                    |");
		System.out.print("| Digite o seu Nome: ");
		String nomeTitular = input.nextLine();
		setTitular(nomeTitular);
		System.out.print("| Digite sua Data de Nascimento: ");
		setDtNasc(dtNasc);
		input.nextLine();
		System.out.print("| Digite o seu CPF(Apenas números): ");
		String cpfcc = input.nextLine();
		setCpf(cpfcc);	
		setStatus(true);  // Altera o valor da Variável para Verdadeiro.
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("======================================================");
		System.out.println("|                 Seja Bem Vindo!!!                  |");
		System.out.println();
		System.out.println("|         Conta Poupança criada com sucesso!!!        ");
		System.out.println("Número da Agência: " + getNumAgencia());
		System.out.println("Número da conta: " + getNumContaCP());
		System.out.println("Nome: " + getTitular());
		System.out.println("| Data de Nascimento: " + getDtNasc());
		System.out.println("CPF: " + getCpf());
		System.out.printf("Saldo atual: R$%.2f\n", getSaldoCP());
		System.out.println();
		System.out.println("| Acesso em: " + (DataHora.toString()));
		System.out.println("|====================================================");
		
	}

	@Override
	public void transferirPix(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
	 		System.out.println("***************** C U B O    B A N K *****************");
	 		System.out.println("************ C O N T A    P O U P A N Ç A ************");
	 		System.out.println("======================================================");
	 		System.out.println("                        P I X                         ");
	 		System.out.println("                       -------                        ");	
	 		System.out.print("| Digite o Valor do Pix que deseja Realizar:");
		valor = input.nextDouble();
		if (this.getSaldoCP() > 0 && this.getSaldoCP() > valor) { //realiza o cálculo para transferir o valor que tem em saldo
			this.setSaldo(this.getSaldo() - valor);
			this.setSaldoCP(this.getSaldoCP() - valor);
			System.out.println("======================================================");
	 		System.out.println("***************** C U B O    B A N K *****************");
	 		System.out.println("************ C O N T A    P O U P A N Ç A ************");
	 		System.out.println("======================================================");
	 		System.out.println("            C O M P R O V A N T E   P I X             ");
	 		System.out.println("           ----------------------  -------            ");
			System.out.println("| Número da Agência: " + getNumAgencia());
			System.out.println("| Número da conta: " + getNumConta());
			System.out.println("| Nome: " + getTitular());
			System.out.println("| CPF: " + getCpf());
			System.out.printf("| Valor do Pix: R$ %.2f\n", valor);
			System.out.printf("| Saldo Anterior: R$ %.2f\n", valor += getSaldoCP());
			System.out.printf("| Saldo Atual: R$ %.2f\n", getSaldoCP());
			System.out.println("| Pix realizado com sucesso!!!");
			System.out.println();
			System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
			System.out.println("| " + DataHora.toString() + "                         ");
			System.out.println();
			
		} else {
			System.out.println("| Pix não realizado, pix insuficiente.");
		}
        } else {
            System.out.println("| Não é possível realizar transferência, Conta Inexistente.");
        }
	}
	
	@Override
	public void depositar(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("************ C O N T A    P O U P A N Ç A ************");
		System.out.println("======================================================");
		System.out.println("                   D E P Ó S I T O                    ");
		System.out.println("                  -----------------                   ");
		System.out.println("Digite o valor que deseja depositar: ");
		valor = input.nextDouble();
		 if (valor > 0) {
			 this.setSaldoCP(this.getSaldoCP() + valor);  //realiza o cálculo para depositar o valor no saldo
			 System.out.println();
	            System.out.println("======================================================");
	    		System.out.println("***************** C U B O    B A N K *****************");
	    		System.out.println("************ C O N T A    P O U P A N Ç A ************");
	    		System.out.println("======================================================");
	    		System.out.println("    C O M P R O V A N T E   D E   D E P Ó S I T O     ");
	    		System.out.println("   ----------------------  ----  -----------------    ");
	    		System.out.printf("|             Valor do Depósito: R$ %.2f\n", valor);
	            System.out.printf("|              Saldo atual: R$ %.2f\n", getSaldo());
	            System.out.println();
	            System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
	    		System.out.println("| " + DataHora.toString() + "                         ");
	    		System.out.println();
	        } else {
	            System.out.println("| Depósito não realizado, valor inválido.");
	        }
        } else {
            System.out.println("| Não é possível realizar depósito, Conta Inexistente.");
        }
	}
	
	@Override
	public void sacar(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
			System.out.println("***************** C U B O    B A N K *****************");
			System.out.println("************ C O N T A    P O U P A N Ç A ************");
			System.out.println("======================================================");
			System.out.println("                      S A Q U E                       ");
			System.out.println("                     -----------                      ");
			System.out.print("|            Digite o valor do Saque: ");
			valor = input.nextDouble();
		if (this.getSaldoCP() > 0 && this.getSaldoCP() > valor) {  //realiza o cálculo para sacar o valor que tem em saldo
			this.setSaldoCP(this.getSaldoCP() - valor);
			System.out.println("|          Saque Realizado com Sucesso!!!");
			System.out.println();
			System.out.println("======================================================");
	 		System.out.println("***************** C U B O    B A N K *****************");
	 		System.out.println("************ C O N T A    P O U P A N Ç A ************");
	 		System.out.println("======================================================");
	 		System.out.println("       C O M P R O V A N T E   D E   S A Q U E        ");
	 		System.out.println("      ----------------------  ----  -----------       ");
	 		System.out.printf("| Valor do Saque: R$%.2f\n",  valor);
	 		System.out.printf("| Saldo Anterior: R$%.2f\n", valor += getSaldoCP());
			System.out.printf("| Saldo Atual: R$%.2f\n", getSaldoCP());
			System.out.println();
			System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
			System.out.println("| " + DataHora.toString() + "                         ");
			System.out.println();
			System.out.printf("| Saldo atual: R$%.2f\n", getSaldoCP());
		} else {
			System.out.println("| Saque não realizado, saldo insuficiente.");
		}
        } else {
            System.out.println("| Não é possível realizar saque, Conta Inexistente.");
        }
		
	}
	
	@Override
	public void investimentoCP(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			valor = 0.005;
			System.out.println("======================================================");
		 	System.out.println("***************** C U B O    B A N K *****************");
		 	System.out.println("************ C O N T A    P O U P A N Ç A ************");
			System.out.println("======================================================");
			System.out.println("                  A P L I C A Ç Ã O                   ");
			System.out.println("|                                                     ");
			System.out.println("| Sua conta poupança está rendendo 0,5% ao mês");
			System.out.printf("| Rendimento bruto: R$%.2f\n", getSaldoCP() * valor);
			System.out.printf("| Estimativa com Rendimento: R$%.2f\n", getSaldoCP() * valor + getSaldoCP());
			System.out.println("| Obs: Rendimento a Partir de 30 dias.                ");	
			System.out.println();
		}else {
            System.out.println("| Não é possível consultar o rendimento, Conta Inexistente.");
        }
		
	}

	@Override
	public void extrato() {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
			System.out.println("***************** C U B O    B A N K *****************");
			System.out.println("************ C O N T A    P O U P A N Ç A ************");
			System.out.println("======================================================");
			System.out.println("                     E X T R A T O                    ");
			System.out.println("                    ---------------                   ");
			System.out.println("Nome do Titular: " + getTitular());
			System.out.println("CPF: " + getCpf());
			System.out.println("Agência: " + getNumAgencia());
			System.out.println("Conta: " + getNumConta());
			System.out.printf("Saldo atual: R$ %.2f\n", getSaldoCP());
			System.out.println();
			System.out.println("Acesso em: " + (DataHora.toString()));
			System.out.println("======================================================");
        } else {
            System.out.println("| Não é possível consultar o extrato, Conta Inexistente.");
        }
		
	}
	
	@Override
	public void acessarCP() {
		boolean sair = false; // necessário para funcionar com o while, inicializa com false.
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		while(!sair) { // while deixa em loop esse acesso ao menu através do switch com as opções para acessar os métodos
		System.out.println("======================================================");
		System.out.println("************ C O N T A    P O U P A N Ç A ************");
		System.out.println("======================================================");
		System.out.println("|------------- Digite a Opção Desejada: -------------|");
		System.out.println("|                                                    |");
		System.out.println("|                 [1] Depositar                      |");
		System.out.println("|                 [2] Sacar                          |");
		System.out.println("|                 [3] Transferir                     |");
		System.out.println("|                 [4] Investimento                   |");
		System.out.println("|                 [5] Exibir extrato                 |");
		System.out.println("|                 [6] Menu Principal                 |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");
		
		int opcao2 = input.nextInt(); // variável necessária para funcionar com o switch
		switch (opcao2) { //switch para acessar os métodos através das opções
		case 1:
			depositar(opcao2);;
			break;
			
		case 2:
			sacar(opcao2);;
			break;
			
		case 3:
			transferirPix(opcao2);
			break;
			
		case 4:
			investimentoCP(opcao2);
			break;
			
		case 5:
			extrato();
			break;
			
		case 6:
			if (sair) {
			CuboBank.main(null); // faz com que o menu através do switch retorne ao método main
			}
			sair = true;
			break;

		default:
			System.out.println("| Opção inválida");
			break;
			}
		}
		}else {
            System.out.println("| Não é possível acessar, Conta Poupança Inexistente.");
        }
		
	}

}



