class Divisao extends Operador{
	
	double calcular(){
		return esquerdo.calcular()/direito.calcular();
	}
}
