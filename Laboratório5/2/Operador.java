class Operador implements Expression{
	Expression  e;

	Operador(Expression e){
		this.e = e;
	}

	@Override
	public double calcular(){
		return e.calcular();
	}
}
