//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
public class Plus extends Conta{

	Plus(int numero_conta){
		this(numero_conta, 0.0);
	}
	
	Plus(int numero_conta, double saldo){
		super(numero_conta, saldo);
	}

	void creditar(double valor){
		this.saldo += valor +(0.005*valor);
	}

	void debitar(double valor){
		this.saldo -=valor;
	}

	@Override
	public String toString(){
		return "Conta Plus\nId:"+this.numero_conta+"\nSaldo da Conta:"+this.saldo;
	}
}