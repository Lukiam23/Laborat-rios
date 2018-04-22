class Subtracao extends OperadorBinario{

	Subtracao(Expressao esquerda, Expressao direita){
		super(esquerda, direita);
	}

	@Override
	public double calcular(){
		return esquerda.calcular() - direita.calcular();
	}
}