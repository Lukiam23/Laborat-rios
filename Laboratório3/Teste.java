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
	}
}