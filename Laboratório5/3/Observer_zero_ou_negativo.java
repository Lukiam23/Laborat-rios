//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Observer_zero_ou_negativo implements Observer{
	//update
	public void imprimir(double e){
		if (e <= 0){
			System.out.println("Resultado zero ou negativo!");	
		}
	}
}