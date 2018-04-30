class Observer_zero_ou_negativo implements Observer{
	//update
	public void imprimir(Expressao e){
		System.out.println("Entrou na função");
		if (e.calcular() <= 0){
			System.out.println("Resultado zero ou negativo!");	
		}
	}
}