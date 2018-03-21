public class Teste{
	public static void main(String [] args){
		Conjunto conjuntoA = new Conjunto(50);
		Conjunto conjuntoB = new Conjunto(40);
		

		for(int i = 0;i<25;i++){
			conjuntoA.inserirElemento(i);
		} 	

		for(int j = 0;j<40;j++){
			conjuntoB.inserirElemento(j);
		} 	
		
		Conjunto conjuntoAuB = conjuntoA.conjuntoUniao(conjuntoB);
		Conjunto conjuntoAUBNegado = conjuntoAuB.barramento();
		Conjunto notA = conjuntoA.barramento();
		Conjunto notB = conjuntoB.barramento();
		Conjunto notAIntersecaoNotB = notA.conjuntoIntersecao(notB);
		System.out.println("Saida do conjunto ~(AUB): ");
		conjuntoAUBNegado.showElementos();
		System.out.println("Saida do conjunto ~A /\\ ~B: ");
		notAIntersecaoNotB.showElementos();

		Conjunto conjuntoAInterB = conjuntoA.conjuntoIntersecao(conjuntoB);
		Conjunto conjuntoAInterBNegado = conjuntoAInterB.barramento();
		Conjunto notAUNotB = notA.conjuntoUniao(notB);
		System.out.println("Saida do conjunto ~(A/\\B): ");
		conjuntoAInterBNegado.showElementos();
		System.out.println("Saida do conjunto ~AU~B: ");
		notAUNotB.showElementos();
	}
}