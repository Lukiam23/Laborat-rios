class Subtracao extends OperadorBinario{

	Subtracao(Expressao esquerda, Expressao direita){
		super(esquerda, direita);
	}

	@Override
	public double calcular(){
		notifyObservers();
		return esquerda.calcular() - direita.calcular();
	}
}