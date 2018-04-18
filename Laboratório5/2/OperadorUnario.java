//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class OperadorUnario extends Operador{
	Expression e;
	OperadorUnario(Expression e){
		this.e = e;
	}
	
	@Override
	public double calcular(){
		return e.calcular();
	}
}
