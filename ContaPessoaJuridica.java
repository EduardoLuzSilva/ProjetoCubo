package projeto;

import java.util.Date;
import java.util.Scanner;

public class ContaPessoaJuridica extends Conta{
	public ContaPessoaJuridica(String dtNasc) {
	
	}
	
	public ContaPessoaJuridica() {

	}

	Date DataHora = new Date();
	Scanner input = new Scanner(System.in);
	
	@Override
	public void abrirConta() {
		this.setSaldoPJ(0); 
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("======================================================");
		System.out.println("|                 Seja Bem Vindo!!!                  |");
		System.out.println("|       Vamos criar sua Conta Pessoa Jurídica.       |");
		System.out.println("|                 C A D A S T R O                    |");
		System.out.println("| Digite Nome da Empresa: ");
		String nomeTitularPJ = input.nextLine();
		setTitularPJ(nomeTitularPJ);
		System.out.println("| Digite o CNPJ(Apenas números):");
		String cnpj = input.nextLine();
		setCnpj(cnpj);
		setNumContaPJ();
		setStatus(true); // altera o valor do atributo status da classe mãe para true
		System.out.printf("| Saldo atual: R$%.2f\n", getSaldoPJ());
		System.out.println("| Nome da Empresa: " + getTitularPJ());
		System.out.println("| CNPJ: " + getCnpj());
		System.out.println("| Número da Agência: " + getNumAgencia());
		System.out.println("| Número da conta: " + getNumContaPJ());
		System.out.println("| Conta Pessoa Jurídica criada com sucesso!");
		System.out.println();
		System.out.println("| Acesso em: " + (DataHora.toString()));
		System.out.println("======================================================");
	
	}
	
	@Override
	public void depositar(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
			System.out.println("***************** C U B O    B A N K *****************");
			System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
			System.out.println("======================================================");
			System.out.println("                   D E P Ó S I T O                    ");
			System.out.println("                  -----------------                   ");
			System.out.print("| Digite o valor que deseja depositar: ");
			valor = input.nextDouble();
		 if (valor > 0) {
			 this.setSaldoPJ(this.getSaldoPJ() + valor);  //realiza o cálculo para depositar o valor no saldo
	            System.out.println("| Depósito realizado com sucesso!!!");
	            System.out.println();
	            System.out.println("======================================================");
				System.out.println("***************** C U B O    B A N K *****************");
				System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
				System.out.println("======================================================");
				System.out.println("    C O M P R O V A N T E   D E   D E P Ó S I T O     ");
	    		System.out.println("   ----------------------  ----  -----------------    ");
	    		System.out.println("|             Valor do Depósito: R$ %.2f\n" + valor);
	            System.out.printf("|              Saldo atual: R$%.2f\n", getSaldoPJ());
	            System.out.println();
	            System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
	    		System.out.println("| " + DataHora.toString() + "                         ");
	    		System.out.println();
	        } else {
	            System.out.println("|             Depósito não realizado, valor inválido.");
	        }
        } else {
            System.out.println("Não é possível realizar depósito, Conta Inexistente.");
        }

	}
	
	@Override 
	public void transferirPix(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
	 		System.out.println("***************** C U B O    B A N K *****************");
	 		System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
	 		System.out.println("======================================================");
	 		System.out.println("                        P I X                         ");
	 		System.out.println("                       -------                        ");	
	 		System.out.print("| Digite o Valor do Pix que deseja Realizar:");
		valor = input.nextDouble();
		if (this.getSaldoPJ() > 0 && this.getSaldoPJ() > valor) { //realiza o cálculo para transferir o valor que tem em saldo
			this.setSaldo(this.getSaldo() - valor);
			this.setSaldoPJ(this.getSaldoPJ() - valor);
			System.out.println("======================================================");
	 		System.out.println("***************** C U B O    B A N K *****************");
	 		System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
	 		System.out.println("======================================================");
	 		System.out.println("            C O M P R O V A N T E   P I X             ");
	 		System.out.println("           ----------------------  -------            ");
			System.out.println("| Número da Agência: " + getNumAgencia());
			System.out.println("| Número da conta: " + getNumContaPJ());
			System.out.println("| Nome: " + getTitularPJ());
			System.out.println("| CPF: " + getCnpj());
			System.out.printf("| Valor do Pix: R$ %.2f\n", valor);
			System.out.printf("| Saldo Anterior: R$ %.2f\n", valor += getSaldoPJ());
			System.out.printf("| Saldo Atual: R$ %.2f\n", getSaldoPJ());
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
	public void sacar(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
			System.out.println("***************** C U B O    B A N K *****************");
			System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
			System.out.println("======================================================");
			System.out.println("                      S A Q U E                       ");
			System.out.println("                     -----------                      ");
			System.out.print("|            Digite o valor do Saque: ");
			valor = input.nextDouble();
		if (this.getSaldoPJ() > 0 && this.getSaldoPJ() > valor) {  //realiza o cálculo para sacar o valor que tem em saldo
			this.setSaldoPJ(this.getSaldoPJ() - valor);
			System.out.println("|          Saque Realizado com Sucesso!!!");
			System.out.println();
			System.out.println("======================================================");
	 		System.out.println("***************** C U B O    B A N K *****************");
	 		System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
	 		System.out.println("======================================================");
	 		System.out.println("       C O M P R O V A N T E   D E   S A Q U E        ");
	 		System.out.println("      ----------------------  ----  -----------       ");
	 		System.out.println();
	 		System.out.println("| Valor do Saque: " + valor);
	 		System.out.printf("| Ssaldo Anterior: R$%.2f\n", valor += getSaldoPJ());
			System.out.printf("| Saldo atual: R$%.2f\n", getSaldoPJ());
			System.out.println();
			System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
    		System.out.println("| " + DataHora.toString() + "                         ");
		} else {
			System.out.println("| Saque não realizado, saldo insuficiente.");

		}
        } else {
            System.out.println("| Não é possível realizar saque, Conta Inexistente.");
        }

	}
	
	@Override
	public void emprestimo(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
		 	System.out.println("***************** C U B O    B A N K *****************");
		 	System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
			System.out.println("======================================================");
			System.out.println("                 E M P R É S T I M O                  ");
			System.out.println("|                                                    |");
			System.out.println("| Quer Aumentar seu Capital de Giro?                 |"); 
			System.out.println("| Simule já seu Empréstimo.                          |");
			System.out.print("| Informe o Valor do Empréstimo: ");
			valor = input.nextDouble();
			double valorjuros = valor * 0.065 + valor;  
			System.out.print("| Digite o Número de Parcelas: ");
			int parcelas = input.nextInt();
			double valorparcelas = valorjuros / parcelas;
			System.out.println("------------------------------------------------------");
			System.out.println("| Número de Parcelas: " + parcelas);
			System.out.printf("| Valor do Empréstimo: R$ %.2f\n", valor);
			System.out.println("| Taxa de Juros: 6,5%");
			System.out.printf("| Valor total com juros: R$ %.2f\n" ,valorjuros);
			System.out.printf("| Valor das parcelas: R$ %.2f\n" ,valorparcelas);
			System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
			System.out.println("|");
			System.out.println("| " + DataHora.toString() + "                         ");
			
		
		}else {
            System.out.println("Não é possível realizar o empréstimo, Conta Inexistente.");
        }

	}
	
	
	@Override
	public void investimento(double juros) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			juros = 0.0092;
			System.out.println("======================================================");
		 	System.out.println("***************** C U B O    B A N K *****************");
		 	System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
			System.out.println("======================================================");
			System.out.println("                  A P L I C A Ç Ã O                   ");
			System.out.println("|                                                     ");
			System.out.println("| Sua conta corrente está rendendo 120% da taxa       ");
			System.out.println("| SELIC que é equivalente a 1,1% ao mês              ");
			double bruto = getSaldo() * juros;
			System.out.println("| Aplicação com cobrança de IR.                       ");
			System.out.print("| Por quantos Meses deseja Aplicar:                     ");
			System.out.println("|");
			int meses = input.nextInt();	
			if (meses > 0 && meses <= 6) {
				double liquido = bruto - (bruto * 0.15);
				System.out.println("------------------------------------------------------");
				System.out.println("| Para Aplicações de: "+meses+ " dias.                ");
				System.out.println("| Taxa de IR será de: 15% Sobre o Rendimento.       ");
				System.out.printf("| Rendimento bruto: R$ %.2f\n", bruto, "               ");
				System.out.printf("| Rendimento líquido: R$ %.2f\n", liquido, "           ");
				System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
				System.out.println("| Obs: Rendimento a Partir de 30 dias.                ");	
				System.out.println();
				
			}else if (meses >= 7 && meses <= 11){
				double liquido = bruto - (bruto * 0.12);
				System.out.println("------------------------------------------------------");
				System.out.println("| Para Aplicações de: "+meses+ " dias.                |");
				System.out.println("| Taxa de IR será de: 12% Sobre o Rendimento.        |");
				System.out.printf("| Rendimento bruto: R$ %.2f\n", bruto);
				System.out.printf("| Rendimento líquido: R$ %.2f\n", liquido);
				System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
				System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");	
				System.out.println();
				
			}else if (meses > 12 && meses <= 36){
				double liquido = bruto - (bruto * 0.08);
				System.out.println("------------------------------------------------------");
				System.out.println("| Para Aplicações de: "+meses+ " dias.                |");
				System.out.println("| Taxa de IR será de: 8% Sobre o Rendimento.      |");
				System.out.printf("| Rendimento bruto: R$ %.2f\n", bruto);
				System.out.printf("| Rendimento líquido: R$ %.2f\n", liquido);
				System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
				System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");
				System.out.println();
				
			}else if (meses > 37 && meses <= 60){
				double liquido = bruto - (bruto * 0.05);
				System.out.println("------------------------------------------------------");
				System.out.println("| Para Aplicações de: "+meses+ " dias.                |");
				System.out.println("| Taxa de IR será de: 5% Sobre o Rendimento.        |");
				System.out.printf("| Rendimento Bruto: R$ %.2f\n", bruto);
				System.out.printf("| Rendimento Líquido: R$ %.2f\n", liquido);
				System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
				System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");	
				System.out.println();
				
			}else if (meses > 60){
				double liquido = bruto - (bruto * 0.02);
				System.out.println("------------------------------------------------------");
				System.out.println("| Para Aplicações de: "+meses+ " dias.                |");
				System.out.println("| Taxa de IR será de: 0,2% Sobre o Rendimento.        |");
				System.out.printf("| Rendimento Bruto: R$ %.2f\n", bruto);
				System.out.printf("| Rendimento Líquido: R$ %.2f\n", liquido);
				System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
				System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");
				System.out.println();
				System.out.println("| Acesso em: " + (DataHora.toString()));
				System.out.println("|=====================================================");
			}else {
				System.out.println("Opção inválida");
			}
			
		}else {
	        System.out.println("Não é possível consultar o rendimento, Conta Inexistente.");
	    }

	}
	@Override
	public void extrato() {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
			System.out.println("======================================================");
			System.out.println("***************** C U B O    B A N K *****************");
			System.out.println("***** C O N T A   P E S S O A    J U R Í D I C A *****");
			System.out.println("======================================================");
			System.out.println("                     E X T R A T O                    ");
			System.out.println("                    ---------------                   ");
			System.out.println("| Nome da Empresa: " + getTitularPJ());
			System.out.println("| CNPJ: " + getCnpj());
			System.out.println("| Agência: " + getNumAgencia());
			System.out.println("| Conta PJ: " + getNumContaPJ());
			System.out.printf("| Saldo atual: R$ %.2f\n", getSaldoPJ());
			System.out.println();
			System.out.println("| Acesso em: " + (DataHora.toString()));
			System.out.println("======================================================");
		
        } else {
            System.out.println("Não é possível consultar o extrato, Conta Inexistente.");
        }
	}
	
	@Override
	public void acessarPJ() {
		boolean sair = false; // necessário para funcionar com o while, inicializa com false.
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		while(!sair) {  // while deixa em loop esse acesso ao menu através do switch com as opções para acessar os métodos
			System.out.println("======================================================");
			System.out.println("***** C O N T A    P E S S O A   J U R Í D I C A *****");
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
			emprestimo(opcao2);;
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
			System.out.println("Opção inválida");
			break;
			}
		}
		}else {
            System.out.println("Não é possível acessar, Conta Pessoa Jurídica Inexistente.");
        }
	}

}



