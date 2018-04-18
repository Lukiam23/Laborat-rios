//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Soma extends OperadorBinario{

	Soma(Expression e,Expression d){
		super(e,d);
	}

	@Override
	public double calcular(){
		return e.calcular() + d.calcular();
	}
}
