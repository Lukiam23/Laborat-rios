//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
public class Extreme extends Conta{

	Extreme(int numero_conta){
		this(numero_conta, 0.0);
	}

	Extreme(int numero_conta, double valor){
		super(numero_conta, valor);
	}

	void creditar(double valor){
		this.saldo += valor + (0.002*valor); //Ele rende um bônus de 0.2% do valor
	}

	void debitar(double valor){
		this.saldo -=valor - (0.002*valor); //Ele restitui 0.2% do valor debitado
	}

	double consultarSaldo(){
		return this.saldo;
	}
}