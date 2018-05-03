//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Main{
	public static void main(String args[]){
		Expressao e1, e2, e3, e4, e5;
		Observer positivo, negativoOuZero;
		e1 = new Operando(90.0);
		e3 = new Operando(2.0);
		positivo = new Observer_positivo();
		negativoOuZero = new Observer_zero_ou_negativo();
		e2 = new Cosseno(e1);
		e2.addObserver(positivo);
		e2.addObserver(negativoOuZero);
		System.out.println(e2.calcular());
		
	}
}