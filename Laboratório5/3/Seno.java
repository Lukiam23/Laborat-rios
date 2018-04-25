import java.lang.Math;
class Seno extends OperadorUnario{
	Seno(Expressao e){
		super(e);
	}

	@Override
	public double calcular(){
		notifyObservers();
		return Math.sin(this.e.calcular());
	}
}