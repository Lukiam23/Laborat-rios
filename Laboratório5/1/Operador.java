//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
abstract class Operador extends Expression{
	Expression  esquerdo, direito;

	void add(Expression e, Expression d){
		this.esquerdo = e;
		this.direito = d;
	}

	abstract double calcular();
}
