class Multiplicacao extends Operador{

        double calcular(){
                return esquerdo.calcular()*direito.calcular();
        }
}

