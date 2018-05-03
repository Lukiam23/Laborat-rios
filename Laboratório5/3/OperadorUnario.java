//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
abstract class OperadorUnario extends Expressao{
	Expressao e;

	OperadorUnario(Expressao e){
		this.e = e;
	}

	public double calcular(){
		return e.calcular();
	}
}