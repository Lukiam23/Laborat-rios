public class Teste{
	//Essa classe foi feita para se testar a questão 4 da lista.
	public static void main(String [] args){
		/*Conjunto A = new Conjunto(4);
		Conjunto B = new Conjunto(2);

		for(int i = 1;i < 5;i++){
			A.inserirElemento(i);
		}	
		for(int j = 2;j < 4;j++){
			B.inserirElemento(j);
		}
		System.out.printf("Produto do Conjunto A = {1, 2, 3, 4} e B = {2, 3}: ");
		ParOrdenado[] produto = A.pordutoCartesiano(B);
		for(int i = 0;i < 8;i++){
			System.out.printf(produto[i].toStringParOrdenado()+" ");
		}
		System.out.printf("\n\n");
		
		System.out.printf("Conjunto A = {1, 2, 3, 4} ao quadrado: ");
		produto = A.pordutoCartesiano(A);
		for(int i = 0;i < 16;i++){
			System.out.printf(produto[i].toStringParOrdenado()+" ");
		}
		System.out.printf("\n\n");

		System.out.printf("Conjunto B = {2, 3} ao quadrado: ");
		produto = B.pordutoCartesiano(B);
		for(int i = 0;i < 4;i++){
			System.out.printf(produto[i].toStringParOrdenado()+" ");
		}
		System.out.printf("\n");*/


		Conjunto conjuntoP = new Conjunto(3);
		for(int i = 1;i < 4;i++){
			conjuntoP.inserirElemento(i);
		}
		conjuntoP.showElementos();

		Conjunto[] partes = conjuntoP.partes();
		for(Conjunto c: partes){
			c.showElementos();
		}




	}
}