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
		
		boolean igual = (conjuntoAUBNegado.subconjunto(notAIntersecaoNotB) && notAIntersecaoNotB.subconjunto(conjuntoAUBNegado))? true:false;
		System.out.printf("O conjunto ~(AUB) é igual a ~A/\\~B? %s\n",igual);

		Conjunto conjuntoAInterB = conjuntoA.conjuntoIntersecao(conjuntoB);
		Conjunto conjuntoAInterBNegado = conjuntoAInterB.barramento();
		Conjunto notAUNotB = notA.conjuntoUniao(notB);

		igual = (conjuntoAInterBNegado.subconjunto(notAUNotB) && notAUNotB.subconjunto(conjuntoAInterBNegado) )? true:false;
		System.out.printf("O conjunto ~(A/\\B) é igual a ~AU~B? %s\n",igual);

	}
}