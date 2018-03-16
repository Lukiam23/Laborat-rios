public class Teste{
	public static void main(String [] args){
		Conjunto A = new Conjunto(50);
		Conjunto B = new Conjunto(40);
		

		for(int i = 0;i<50;i++){
			A.inserirElemento(i);
		} 	

		for(int j = 0;j<40;j++){
			A.inserirElemento(i);
		} 	
		Conjunto AuB = A.conjuntoUniao(B);
		AuB.barramento();
	}
}