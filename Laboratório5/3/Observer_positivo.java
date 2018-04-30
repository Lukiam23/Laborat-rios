class Observer_positivo implements Observer{
	//update
	public void imprimir(Expressao e){
		System.out.println("Entrou na função");
		if (e.calcular() > 0){
			System.out.println("Resultado positivo!");	
		}
	}
}