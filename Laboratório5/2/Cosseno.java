class Cosseno extends Operador{
	Expression e;
	Seno(Expression e){
		this.e =e;
	}

	@Override
	public double calcular(){
		double radianos = Math.toRadianse(e.super.calcular());
		return Math.cos(radianos);
	}
}