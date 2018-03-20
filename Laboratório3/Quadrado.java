class Quadrado extends Figura{

	float lado;

	Quadrado(float x, float y, float lado){
		super(x,y);
		super.setCor("Nenhuma");
		this.lado = lado;
	}

	Quadrado(float x, float y, float lado, String cor){
		super(x,y);
		super.setCor(cor);
		this.lado = lado;
	}


	String desenhar(){
		return this.toString();
	}

	void mover(float dx, float dy){
		this.x = dx;
		this.y = dy;
	}

	double calcularArea(){
		return lado*lado;
	}


}