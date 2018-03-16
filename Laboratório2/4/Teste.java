public class Teste{
	//Essa classe foi feita para se testar a questão 4 da lista.
	public static void main(String [] args){
		Conjunto A = new Conjunto(5);
		Conjunto B = new Conjunto(2);

		for(int i = 0;i < 5;i++){
			A.inserirElemento(i);
		}	
		for(int j = 10;j < 12;j++){
			B.inserirElemento(j);
		}

		A.pordutoCartesiano(B);
	}
}