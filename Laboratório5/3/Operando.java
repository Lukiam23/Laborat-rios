class Operando extends Expressao{
	private double valor;

	double getValor(){
		return valor;
	}

	void setValor(double valor){
		this.valor = valor;
		//notifyObservers();
	}

	Operando(double valor){
		this.valor = valor;
	}

	public double calcular(){
		return valor;
	}
}