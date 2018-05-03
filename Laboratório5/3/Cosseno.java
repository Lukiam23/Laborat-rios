//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Cosseno extends OperadorUnario{
	Cosseno(Expressao e){
		super(e);
	}

	@Override
	public double calcular(){
		double value = Math.cos(Math.toRadians(super.calcular()));
		notifyObservers(value);
		return value;
	}
}
