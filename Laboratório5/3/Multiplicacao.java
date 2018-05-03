//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Multiplicacao extends OperadorBinario{

	Multiplicacao(Expressao e,Expressao d){
		super(e,d);
	}

	@Override
	public double calcular(){
		double value = esquerda.calcular() * direita.calcular();
		notifyObservers(value);
		return value;
	}
}
