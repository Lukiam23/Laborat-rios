//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
public class Sistema{
	Conta[] contas = new Conta[10];
	int posicao = 0;

	void criarContaXPTOBasic(int numero_conta){
		if(!contaExiste(numero_conta)){
			contas[posicao] = new Basic(numero_conta);
			posicao++;
		}
	}

	void criarContaXPTOPlus(int numero_conta){
		if(!contaExiste(numero_conta)){
			contas[posicao] = new Plus(numero_conta);
			posicao++;
		}
	}

	void criarContaXPTOExtreme(int numero_conta){
		if(!contaExiste(numero_conta)){
			contas[posicao] = new Extreme(numero_conta);
			posicao++;
		}
	}

	void creditar(int posicao, double valor){
		contas[posicao].creditar(valor);
	}

	

	//Ele vai iterar sobre os elementos e comparar os numeros de cada conta que há no vetor contas. 
	//Retornará true se encontrar alguma conta com mesmo número que numero_conta e false caso contrário.
	boolean contaExiste(int numero_conta){
		for(Conta c: contas){
			if(c.getNumeroConta() == numero_conta){
				return true;
			}
		}
		return false;
	}

	public static void main (String args[]) {
		Sistema s = new Sistema();
		s.criarContaXPTOBasic(1);
		s.criarContaXPTOPlus(2);
		s.criarContaXPTOExtreme(3);
		for(int i = 1; i<=3; i++) s.creditar(i,1000);
		for(int i = 1; i<=3; i++) s.debitar(i,10);
		//todas as igualdades devem ser verdadeiras
		/*s.consultarSaldo(1) == 990;
		s.consultarSaldo(1) == 995;
		s.consultarSaldo(1) == 992.02;*/

		System.out.println(990 == 1);
	}


}