class OperadorUnario extends Operador{
	Expression e;
	OperadorUnario(Expression e){
		this.e = e;
	}
	
	@Override
	public double calcular(){
		return e.calcular();
	}
}
