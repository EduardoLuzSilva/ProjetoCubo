package projeto;

import java.util.Date;
import java.util.Scanner;

public class ContaCorrente extends Conta{


	Date DataHora = new Date();
	Scanner input = new Scanner(System.in);


public ContaCorrente(Object object) {
	}

public ContaCorrente() {
	
}

private void setDtNasc(Object dtNasc) {
	
}

@Override
public void abrirConta() {
	this.setSaldo(0);
	System.out.println("======================================================");
	System.out.println("***************** C U B O    B A N K *****************");
	System.out.println("======================================================");
	System.out.println("|                 Seja Bem Vindo!!!                  |");
	System.out.println("|          Vamos criar sua Conta Corrente.           |");
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
	setStatus(true); // altera o valor do atributo status da classe mãe para true
	System.out.println("======================================================");
	System.out.println("***************** C U B O    B A N K *****************");
	System.out.println("======================================================");
	System.out.println("|                 Seja Bem Vindo!!!                  |");
	System.out.println();
	System.out.println("|        Conta Corrente Criada com Sucesso!!!        |");
	System.out.println("| Número da Agência: " + getNumAgencia());
	System.out.println("| Número da conta: " + getNumConta());
	System.out.println("| Nome: " + getTitular());
	System.out.println("| Data de Nascimento: " + getDtNasc());
	System.out.println("| CPF: " + getCpf());
	System.out.printf("| Saldo Atual: R$ %.2f\n", getSaldo());
	System.out.println("|                                                   |");
	System.out.println("| Acesso em: " + (DataHora.toString()));
	System.out.println("|====================================================");
	
}

@Override 
public void transferirPix(double valor) {
	if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.println("======================================================");
 		System.out.println("***************** C U B O    B A N K *****************");
 		System.out.println("************ C O N T A    C O R R E N T E ************");
 		System.out.println("======================================================");
 		System.out.println("                        P I X                         ");
 		System.out.println("                       -------                        ");	
 		System.out.print("| Digite o Valor do Pix que deseja Realizar: R$ ");
	valor = input.nextDouble();
	if (this.getSaldo() > 0 && this.getSaldo() > valor) { //realiza o cálculo para transferir o valor que tem em saldo
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("======================================================");
 		System.out.println("***************** C U B O    B A N K *****************");
 		System.out.println("************ C O N T A    C O R R E N T E ************");
 		System.out.println("======================================================");
 		System.out.println("            C O M P R O V A N T E   P I X             ");
 		System.out.println("           ----------------------  -------            ");
		System.out.println("| Número da Agência: " + getNumAgencia());
		System.out.println("| Número da conta: " + getNumConta());
		System.out.println("| Nome: " + getTitular());
		System.out.println("| CPF: " + getCpf());
		System.out.printf("| Valor do Pix: R$ %.2f\n", valor);
		System.out.printf("| Saldo Anterior: R$ %.2f\n", valor += getSaldo());
		System.out.printf("| Saldo Atual: R$ %.2f\n", getSaldo());
		System.out.println("| Pix realizado com sucesso!!!");
		System.out.println();
		System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
		System.out.println("| " + DataHora.toString() + "                         ");
		System.out.println();
		
	} else {
		System.out.println("Pix não realizado, Saldo Insuficiente.");

	}
    } else {
        System.out.println("Não é possível realizar transferência, Conta Inexistente.");
    }

}

@Override
public void depositar(double valor) {
	if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("************ C O N T A    C O R R E N T E ************");
		System.out.println("======================================================");
		System.out.println("                   D E P Ó S I T O                    ");
		System.out.println("                  -----------------                   ");
		System.out.print("| Digite o valor que deseja depositar: ");
	valor = input.nextDouble();
	 if (valor > 0) {
		 this.setSaldo(this.getSaldo() + valor);  //Soma Valor do Saldo e do Deposito.
            System.out.println("| Depósito realizado com sucesso!!!");
            System.out.println();
            System.out.println("======================================================");
    		System.out.println("***************** C U B O    B A N K *****************");
    		System.out.println("************ C O N T A    C O R R E N T E ************");
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
	if (this.getStatus() == true) { // Verifica se a Variável status retorna Verdadeiro para Executar o Método.
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("************ C O N T A    C O R R E N T E ************");
		System.out.println("======================================================");
		System.out.println("                      S A Q U E                       ");
		System.out.println("                     -----------                      ");
		System.out.print("|            Digite o valor do Saque: R$ ");
		valor = input.nextDouble();
		if (this.getSaldo() > 0 && this.getSaldo() > valor) {  //Verifica se Há Saldo e se o Saldo é Maior que o Valor do Saque.
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("|          Saque Realizado com Sucesso!!!");
		System.out.println();
		System.out.println("======================================================");
 		System.out.println("***************** C U B O    B A N K *****************");
 		System.out.println("************ C O N T A    C O R R E N T E ************");
 		System.out.println("======================================================");
 		System.out.println("       C O M P R O V A N T E   D E   S A Q U E        ");
 		System.out.println("      ----------------------  ----  -----------       ");
 		System.out.printf("| Valor do Saque: R$%.2f\n",  valor);
 		System.out.printf("| Saldo Anterior: R$%.2f\n", valor += getSaldo());
		System.out.printf("| Saldo Atual: R$%.2f\n", getSaldo());
		System.out.println();
		System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
		System.out.println("| " + DataHora.toString() + "                         ");
		System.out.println();
	} else {
		System.out.println("| Saque não realizado, Saldo insuficiente.");

	}
    } else {
        System.out.println("| Não é possível realizar saque, Conta Inexistente.");
    }

}

@Override
public void emprestimo(double valor) {
	if (this.getStatus() == true) { // Verifica se a Variável status retorna Verdadeiro para Executar o Método.
	System.out.println("======================================================");
 	System.out.println("***************** C U B O    B A N K *****************");
	System.out.println("************ C O N T A    C O R R E N T E ************");
	System.out.println("======================================================");
	System.out.println("                 E M P R É S T I M O                  ");
	System.out.println("|                                                    |");
	System.out.println("| A Contas Apertaram?                                |"); 
	System.out.println("| Simule já seu Empréstimo.                          |");
	System.out.print("| Informe o Valor do Empréstimo: R$ ");
	valor = input.nextDouble();
	double valorjuros = valor * 0.15 + valor;  
	System.out.print("| Digite o Número de Parcelas: ");
	int parcelas = input.nextInt();
	double valorparcelas = valorjuros / parcelas;
	System.out.println("------------------------------------------------------");
	System.out.printf("| Valor do Empréstimo: R$ %.2f\n", valor);
	System.out.println("| Número de Parcelas: " + parcelas);
	System.out.println("| Taxa de Juros: 15%");
	System.out.printf("| Valor total com juros: R$ %.2f\n" ,valorjuros);
	System.out.printf("| Valor das parcelas: R$ %.2f\n" ,valorparcelas);
	System.out.println("|");
	System.out.println("| TRANSAÇÃO REALIZADA EM:                             ");
	System.out.println("| " + DataHora.toString() + "                         ");
	System.out.println("|");
	}else {
        System.out.println("| Não é possível realizar o empréstimo, Conta Inexistente.");
    }

}

@Override
public void investimento(double juros) {
	if (this.getStatus() == true) { // Verifica se a Variável status retorna Verdadeiro para Executar o Método.
		juros = 0.0092;
		System.out.println("======================================================");
	 	System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("************ C O N T A    C O R R E N T E ************");
		System.out.println("======================================================");
		System.out.println("                  A P L I C A Ç Ã O                   ");
		System.out.println("|                                                     ");
		System.out.println("| Sua conta corrente está rendendo 100% da taxa       ");
		System.out.println("| SELIC que é equivalente a 0,92% ao mês              ");
		double bruto = getSaldo() * juros;
		System.out.println("| Aplicação com cobrança de IR.                       ");
		System.out.print("| Por quantos Meses deseja Aplicar:                     ");
		input.nextLine();
		System.out.println();
		int meses = input.nextInt();	
		if (meses > 0 && meses <= 6) {
			double liquido = bruto - (bruto * 0.225);
			System.out.println("------------------------------------------------------");
			System.out.println("| Para Aplicações de: "+meses+ " meses.                ");
			System.out.println("| Taxa de IR será de: 22,5% Sobre o Rendimento.       ");
			System.out.printf("| Rendimento bruto: R$ %.2f\n", bruto, "               ");
			System.out.printf("| Rendimento líquido: R$ %.2f\n", liquido, "           ");
			System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
			System.out.println("| Obs: Rendimento a Partir de 30 dias.                ");	
			System.out.println();
			
		}else if (meses >= 7 && meses <= 11){
			double liquido = bruto - (bruto * 0.20);
			System.out.println("------------------------------------------------------");
			System.out.println("| Para Aplicações de: "+meses+ " meses.                |");
			System.out.println("| Taxa de IR será de: 20% Sobre o Rendimento.        |");
			System.out.printf("| Rendimento bruto: R$ %.2f\n", bruto);
			System.out.printf("| Rendimento líquido: R$ %.2f\n", liquido);
			System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
			System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");	
			System.out.println();
			
		}else if (meses > 12 && meses <= 36){
			double liquido = bruto - (bruto * 0.175);
			System.out.println("------------------------------------------------------");
			System.out.println("| Para Aplicações de: "+meses+ " meses.                |");
			System.out.println("| Taxa de IR será de: 17,5% Sobre o Rendimento.      |");
			System.out.printf("| Rendimento bruto: R$ %.2f\n", bruto);
			System.out.printf("| Rendimento líquido: R$ %.2f\n", liquido);
			System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
			System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");
			System.out.println();
			
		}else if (meses > 37 && meses <= 60){
			double liquido = bruto - (bruto * 0.15);
			System.out.println("------------------------------------------------------");
			System.out.println("| Para Aplicações de: "+meses+ " meses.                |");
			System.out.println("| Taxa de IR será de: 15% Sobre o Rendimento.        |");
			System.out.printf("| Rendimento Bruto: R$ %.2f\n", bruto);
			System.out.printf("| Rendimento Líquido: R$ %.2f\n", liquido);
			System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
			System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");	
			System.out.println();
			
		}else if (meses > 60){
			double liquido = bruto - (bruto * 0.05);
			System.out.println("------------------------------------------------------");
			System.out.println("| Para Aplicações de: "+meses+ " meses.                |");
			System.out.println("| Taxa de IR será de: 0,5% Sobre o Rendimento.        |");
			System.out.printf("| Rendimento Bruto: R$ %.2f\n", bruto);
			System.out.printf("| Rendimento Líquido: R$ %.2f\n", liquido);
			System.out.printf("| Valor estimado com o rendimento: R$ %.2f\n", liquido + getSaldo());
			System.out.println("| Obs: Rendimento a Partir de 30 dias.               |");
			System.out.println();
			System.out.println("| Acesso em: " + (DataHora.toString()));
			System.out.println("|=====================================================");
		}else {
			System.out.println("| Opção inválida");
		}
		
	}else {
        System.out.println("| Não é possível consultar o rendimento, Conta Inexistente.");
    }

}

@Override
public void extrato() {
	if (this.getStatus() == true) { // Verifica se a Variável status retorna Verdadeiro para Executar o Método.
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("************ C O N T A    C O R R E N T E ************");
		System.out.println("======================================================");
		System.out.println("                     E X T R A T O                    ");
		System.out.println("                    ---------------                   ");
		System.out.println("| Nome do Titular: " + getTitular());
		System.out.println("| CPF: " + getCpf());
		System.out.println("| Agência: " + getNumAgencia());
		System.out.println("| Conta: " + getNumConta());
		System.out.printf("| Saldo atual: R$ %.2f\n", getSaldo());
		System.out.println();
		System.out.println("| Acesso em: " + (DataHora.toString()));
		System.out.println("======================================================");
    } else {
        System.out.println("| Não é possível consultar o extrato, Conta Inexistente.");
    }
}

@Override
public void acessarCC() {
	boolean sair = false; // necessário para funcionar com o while, inicializa com false.
	if (this.getStatus() == true) { // Verifica se a Variável status retorna Verdadeiro para Executar o Método.
	while(!sair) {  // while deixa em loop esse acesso ao menu através do switch com as opções para acessar os métodos
		System.out.println("======================================================");
		System.out.println("***************** C U B O    B A N K *****************");
		System.out.println("************ C O N T A    C O R R E N T E ************");
		System.out.println("======================================================");
		System.out.println("|------------- Digite a Opção Desejada: -------------|");
		System.out.println("|                                                    |");
		System.out.println("|                 [1] Depositar                      |");
		System.out.println("|                 [2] Sacar                          |");
		System.out.println("|                 [3] Pix                            |");
		System.out.println("|                 [4] Empréstimo                     |");
		System.out.println("|                 [5] Investimento                   |");
		System.out.println("|                 [6] Exibir Extrato                 |");
		System.out.println("|                 [7] Menu Principal                 |");
		System.out.println("|                                                    |");
		System.out.println("======================================================");
	
	int opcao2 = input.nextInt(); // Variável para rodar o switch
	switch (opcao2) { //Switch Case para acessar os Métodos.
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
		investimento(opcao2);
		break;
		
	case 6:
		extrato();
		break;
		
	case 7:
		CuboBank.main(null); // Retorna ao Método Main
		break;
	
	default:
		System.out.println("| Opção inválida.");
		break;
		}
	}
	}else {
        System.out.println("| Não é possível acessar, Conta Corrente Inexistente.");
    }
}

}



