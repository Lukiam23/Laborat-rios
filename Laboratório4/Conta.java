//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
public abstract class Conta{
	int numero_conta; //id
	double saldo;

	Conta(int numero_conta){
		this(numero_conta,0.0);
	}

	Conta(int numero_conta, double saldo){
		this.numero_conta = numero_conta;
		this.saldo = saldo;
	}

	abstract void creditar(double valor);
	abstract void debitar(double valor);

	double consultarSaldo(){
		return this.saldo;
	}

	public int getNumeroConta(){
		return this.numero_conta;
	}
}