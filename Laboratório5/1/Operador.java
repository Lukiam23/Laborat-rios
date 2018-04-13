class Operador extends Expression{
	Expression  esquerdo, direito;

	void add(Expression e, Expression d){
		this.esquerdo = e;
		this.direito = d;
	}
}
