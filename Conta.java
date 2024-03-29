package projeto;

import java.util.Random;
import java.util.Scanner;

public class Conta {

	Random random = new Random();
	Scanner input = new Scanner(System.in);

	
	private int numConta;
	private int numContaCP;
	private int numContaPJ;
	private int numAgencia = 0550;
	private String titular;
	private String titularPJ;
	private double saldo;
	private double saldoCP;
	private double saldoPJ;
	private boolean status = false;
	private String cpf;
	private String cnpj;
	protected String dtNasc;
	private String celular;
	private String email;
	
	public int getNumContaCP() {
		return numContaCP;
	}

	public void setNumContaCP() {
	       this.numContaCP = random.nextInt(10000);
	}
	
	public int getNumContaPJ() {
		return numContaPJ;
	}

	public void setNumContaPJ() {
	       this.numContaPJ = random.nextInt(10000); 
	}
	
	public double getSaldoCP() {
		return saldoCP;
	}

	public void setSaldoCP(double saldoCP) {
		this.saldoCP = saldoCP;
	}
	
	public double getSaldoPJ() {
		return saldoPJ;
	}

	public void setSaldoPJ(double saldoPJ) {
		this.saldoPJ = saldoPJ;
	}


	public void abrirConta() {
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta() {	
        this.numConta = random.nextInt(10000); 
		
	}
	
	public int getNumAgencia() {  // o setNumAgencia foi apagado e não é necessário porque o valor fixo foi setado direto no atributo.
		return numAgencia;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitularPJ() {
		return titularPJ;
	}

	public void setTitularPJ(String titularPJ) {
		this.titularPJ = titularPJ;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		
		while(cpf.length() != 11) {  // Define a Variável cpf com 11 Caracteres.
			System.out.println("CPF inválido, digite 11 dígitos");
			cpf = input.nextLine();	
		}
		this.cpf = cpf;	
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		
		while(cnpj.length() != 14) { // Define a Variável cnpj com 14 Caracteres.
			System.out.println("CNPJ inválido, digite 14 dígitos");
			cnpj = input.nextLine();	
		}
		this.cnpj = cnpj;	
	}
	
	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// métodos abaixo
	

	public void transferirPix(double valor) {
		
	}
	
	public void extrato() {
		
	}
	
	public void sacar(double valor) {
		
	}
	
	public void depositar(double valor) {

		
	}
	
	public void emprestimo(double valor) {
		
	}
	
	public void investimento(double juros) {
		
	}
	
	public void investimentoCP(double valor) {
		
	}
	
	public void acessarCC() {
		
	}
	
	public void acessarCP() {
		
	}
	
	public void acessarPJ() {
		
	}


}