class Multiplicacao extends Operador{
	Expression e,d;

	Soma(Expression e,Expression d){
		this.e = e;
		this.d = d;
	}

	double calcular(){
		return e.super.calcular() * d.super.calcular();
	}
}