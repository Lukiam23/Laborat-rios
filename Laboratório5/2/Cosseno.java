class Cosseno extends OperadorUnario{
	Cosseno(Expression e){
		super(e);
	}

	@Override
	public double calcular(){
		return Math.cos(Math.toRadians(super.calcular()));
	}
}
