class Soma extends Operador{
	Expression e,d;

	Soma(Expression e,Expression d){
		this.e = e;
		this.d = d;
	}

	@Override
	public double calcular(){
		return e.super.calcular() + d.super.calcular();
	}
}