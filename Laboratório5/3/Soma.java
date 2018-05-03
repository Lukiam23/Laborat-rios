//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Soma extends OperadorBinario{

	Soma(Expressao esquerda, Expressao direita){
		super(esquerda, direita);
	}

	@Override
	public double calcular(){
		double value = esquerda.calcular() + direita.calcular();
		notifyObservers(value);
		return value;
	}
}