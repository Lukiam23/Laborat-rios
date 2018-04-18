//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Cosseno extends OperadorUnario{
	Cosseno(Expression e){
		super(e);
	}

	@Override
	public double calcular(){
		return Math.cos(Math.toRadians(super.calcular()));
	}
}
