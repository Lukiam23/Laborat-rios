//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
import java.lang.Math;
class Seno extends OperadorUnario{
	Seno(Expressao e){
		super(e);
	}

	@Override
	public double calcular(){
		double value = Math.sin(this.e.calcular());
		notifyObservers(value);
		return value;
	}
}