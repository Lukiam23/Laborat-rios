//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Seno extends OperadorUnario{	
	Seno(Expression e){
		super(e);
	}

	@Override
	public double calcular(){
		return Math.sin(Math.toRadians(super.calcular()));
	}
}
