class Main{
	public static void main(String args[]){
		Expressao e1, e2, e3, e4, e5;
		Observer positivo, negativoOuZero;
		e1 = new Operando(-45.0);
		e3 = new Operando(30.0);
		positivo = new Observer_positivo();
		negativoOuZero = new Observer_zero_ou_negativo();
		e2 = new Seno(e1);
		e2.addObserver(positivo);
		e2.addObserver(negativoOuZero);
		System.out.println(e2.calcular());
		
	}
}