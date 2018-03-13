public class Num{
	public static void main(String [] args){
		Conjunto A = new Conjunto(5);
		Conjunto B = new Conjunto(2);

		A.inserirElemento(100);
		A.inserirElemento(2);
		A.inserirElemento(3);
		A.inserirElemento(4);
		A.inserirElemento(5);

		B.inserirElemento(1);
		B.inserirElemento(100);

		System.out.println("Elementos de A");
		System.out.println(A.getElemento(0));
		System.out.println(A.getElemento(1));
		System.out.println(A.getElemento(2));
		System.out.println(A.getElemento(3));
		System.out.println(A.getElemento(4));
		System.out.println("Elementos de B");
		System.out.println(B.getElemento(0));
		System.out.println(B.getElemento(1));
		System.out.println("Elementos de C");
		
		Conjunto C = B.conjuntoUnião(A);
		System.out.println(C.getElemento(0));
		System.out.println(C.getElemento(1));
		System.out.println(C.getElemento(2));
		System.out.println(C.getElemento(3));
		System.out.println(C.getElemento(4));
		System.out.println(C.getElemento(5));

		Conjunto intersecao = B.conjuntoIntersecao(A);
		System.out.println("Conjunto Interseção");
		System.out.println(intersecao.getElemento(0));

		Conjunto diferenca = A.conjuntoDiferenca(B);
		System.out.println("Diferença de Conjuntos");
		System.out.println(diferenca.getElemento(0));
		System.out.println(diferenca.getElemento(1));
		System.out.println(diferenca.getElemento(2));
		System.out.println(diferenca.getElemento(3));




	}
}