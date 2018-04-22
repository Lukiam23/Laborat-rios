class Observer_positivo implements Observer{
	//update
	void imprimir(Expressao e){
		if (e.calcular() > 0){
			System.out.println("Resultado positivo!");	
		}
	}
}