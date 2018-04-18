//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Multiplicacao extends OperadorBinario{

	Soma(Expression e,Expression d){
		super(e,d);
	}

	double calcular(){
		return e.calcular() * d.calcular();
	}
}
