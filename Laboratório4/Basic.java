//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
public class Basic extends Conta{

	Basic(int numero_conta){
		this(numero_conta, 0.0);
	}

	Basic(int numero_conta, double valor){
		super(numero_conta, valor);
	}

	void creditar(double valor){
		this.saldo += valor;
	}

	void debitar(double valor){
		this.saldo -=valor;
	}

	@Override
	public String toString(){
		return "Conta Basic\nId:"+this.numero_conta+"\nSaldo da Conta:"+this.saldo;
	}

}
