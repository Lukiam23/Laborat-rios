class ConjuntoUniverso{
	Object[] qualquerTipo;
	int tamanho;
	int index = 0;

	public ConjuntoUniverso(int tamanho){
		qualquerTipo = new Object[tamanho];
	}

	public void inserirElemento(Object elemento){
		this.qualquerTipo[index] = elemento;
		index++;
	}

	void showElementosObject(){
		for(int i = 0;i < this.index;i++){
			System.out.printf(this.qualquerTipo[i]+" ");
		}
		System.out.printf("\n");
	}

}