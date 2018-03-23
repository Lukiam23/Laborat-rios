import java.util.*;

public class Conjunto{
	int tamanho;
	int[] elementos;
	int index = 0;

	public Conjunto(int tamanho){
		this.tamanho = tamanho;
		elementos = new int[this.tamanho];
	}

	boolean inserirElemento(int elemento){
		if(verificarPertinencia(elemento) == false){
			this.elementos[this.index] = elemento;
			this.index++;
			return true;
		}
		return false;	
	}

	boolean verificarPertinencia(int elemento){
		for(int i = 0;i<this.index;i++){
			if(elemento == elementos[i]){
				return true;
			}
		}
		return false;
	}

	boolean subconjunto(Conjunto A){
		//O método faz a seguinte pergunta: O conjunto A está contido neste conjunto?
		boolean pertence;
		for(int i = 0;i<A.getIndex();i++){
			pertence = false;
			for(int j = 0;j<this.index; j++){
				if(A.getElemento(i) == this.elementos[j]){
					pertence = true;
				}
			}
			if(pertence == false){
				return false;
			}
		}
		return true;
	}

	Conjunto conjuntoUniao(Conjunto A){
		//Retorna o conjunto União desse conjunto com A
		Conjunto uniao;
		int tamanho = A.getIndex() + this.index + 1;
		uniao = new Conjunto(tamanho);
		int index = 0;
		for(int i = 0;i<A.getIndex();i++){
			uniao.inserirElemento(A.getElemento(i));

		}
		for(int j = 0;j<this.index;j++){
			uniao.inserirElemento(this.elementos[j]);
		}
		return uniao;

	}

	Conjunto conjuntoIntersecao(Conjunto A){
		//Retorna o conjunto intersecção desse conjunto com A
		Conjunto intersecao;
		int tamanho = A.getIndex() + this.index + 1;
		intersecao = new Conjunto(tamanho);
		for(int i = 0;i<A.getIndex();i++){
			for(int j = 0;j<this.index;j++){
				if(A.getElemento(i) == this.elementos[j]){
					intersecao.inserirElemento(this.elementos[j]);
				}
			}
		}
		return intersecao;
	}

	Conjunto conjuntoDiferenca(Conjunto A){
		//O método retorna os elementos deste conjunto sem os elementos de A
		Conjunto intersecao = conjuntoIntersecao(A);
		Conjunto diferenca = new Conjunto(this.index - intersecao.getIndex() + 1);
		boolean pertence;

		
		for(int i = 0;i<this.index;i++){
			boolean contido = false;
			int j = 0;
			while(j<intersecao.getIndex() && !contido){
				if(intersecao.getElemento(j) == this.elementos[i]){
					contido = true;
				}
				j++;
			}
			if(!contido){
				diferenca.inserirElemento(this.elementos[i]);
			}
		}
		return diferenca;
	}

	ParOrdenado[] pordutoCartesiano(Conjunto A){
		//Esse método retona um vetor de inteiros com o produto cartesiano entre este conjunto e o conjunto A. E dado o par (x,y), x pertencerá a este conjunto e y ao conjunto A.
		int tamanho = this.tamanho*A.getTamanho();
		ParOrdenado[] produtos = new ParOrdenado[tamanho];
		int posicao = 0;
		for(int j = 0;j < A.getIndex();j++){
			for(int i = 0;i < this.index;i++){
				produtos[posicao] = new ParOrdenado(this.elementos[i],A.getElemento(j));
				posicao++;
			} 
		} 
		return produtos;
	}

	public List <Conjunto> partes(){
		List <Conjunto> retorno = new ArrayList <Conjunto>();
		Conjunto primeiroElemento = new Conjunto(1);
		primeiroElemento.inserirElemento(this.getElemento(0));
		retorno.add(primeiroElemento);
		
		if(this.index == 1){
			Conjunto[] retornado = new Conjunto[retorno.size()];
			return retorno;
		}

		else{
			Conjunto conjuntoSemPrimeiro = new Conjunto(this.index);
			
			for(int i = 1;i < this.index;i++){
				conjuntoSemPrimeiro.inserirElemento(this.getElemento(i));
			}

			for(Conjunto elemento : conjuntoSemPrimeiro.partes()){
				retorno.add(elemento);
				retorno.add(elemento.conjuntoUniao(primeiroElemento));
			}
			Conjunto[] retornado = new Conjunto[retorno.size()];
			return retorno;

		}
}

	int getTamanho(){
		return this.tamanho;
	}

	int getIndex(){
		return this.index;
	}

	int getElemento(int index){
		return this.elementos[index];
	}

	void showElementos(){
		//O método criada apenas para printar os elementos do conjunto na tela
		for(int i = 0;i < this.index;i++){
			System.out.printf(this.elementos[i]+" ");
		}
		System.out.printf("\n");
	}
	String returnElementos(){
		String str = "{";
		for(int i = 0;i < this.index;i++){
			str += (i==this.index-1)?this.elementos[i]:this.elementos[i]+",";
		}
		str += "}";
		return str;
	}

	boolean conjuntoVazio(){
		//Essa o método retorna true se o conjunto estiver vazio e false caso contrário
		boolean vazio = (this.index == 0) ? true : false;
		return vazio;
	}
}