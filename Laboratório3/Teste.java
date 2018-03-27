class Teste{
	public static void main(String args[]){
		Quadrado q1 = new Quadrado(0,0,2);
		Quadrado q2 = new Quadrado(0,0,4);

		Circulo c1 = new Circulo(0,0,2);
		Circulo c2 = new Circulo(0,0,4);

		System.out.println(q1.desenhar());
		System.out.println(q1.calcularArea());
		System.out.println(q2.desenhar());
		System.out.println(q2.calcularArea());

		//Questão 5
		Figura[] figurasConcretas = new Figura[10];

		for(int i = 0;i < 5;i++){
			figurasConcretas[i] = new Quadrado(i,i+10,(int) Math.pow(2.0,i),"Azul");
		}

		for(int i = 5;i < 10;i++){
			figurasConcretas[i] = new Circulo(i,i+10,2);
		}

		for(int i = 0;i < 10;i++){
			if(figurasConcretas[i] instanceof Colorida){
				System.out.println(figurasConcretas[i].desenhar()+" área "+figurasConcretas[i].calcularArea());
			}
		}
	}
}