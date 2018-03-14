public class Teste{
	public static void main(String [] args){
		Conjunto dezPrimeirosNaturais = new Conjunto(10);//1
		Conjunto cincoPrimeirosPares = new Conjunto(5);//2
		Conjunto cincoPrimeirosImpares = new Conjunto(5);//3
		Conjunto dezPrimeirosPrimos = new Conjunto(10);//4

		for(int i = 0;i < 10;i++){
			dezPrimeirosNaturais.inserirElemento(i);
		}
		
		for(int i = 0;i < 10;i=i+2){
			cincoPrimeirosPares.inserirElemento(i);
		}

		for(int i = 1;i < 10;i=i+2){
			cincoPrimeirosImpares.inserirElemento(i);
		}

		dezPrimeirosPrimos.inserirElemento(1);
		dezPrimeirosPrimos.inserirElemento(2);
		dezPrimeirosPrimos.inserirElemento(3);
		dezPrimeirosPrimos.inserirElemento(5);
		dezPrimeirosPrimos.inserirElemento(7);
		dezPrimeirosPrimos.inserirElemento(11);
		dezPrimeirosPrimos.inserirElemento(13);
		dezPrimeirosPrimos.inserirElemento(17);
		dezPrimeirosPrimos.inserirElemento(19);
		dezPrimeirosPrimos.inserirElemento(23);
		

		//Se o conjunto 4 é subconjunto de si mesmo;
		System.out.printf("Se o conjunto 4 é subconjunto de si mesmo? %b\n",dezPrimeirosPrimos.subconjunto(dezPrimeirosPrimos));	
  

		
	}
}