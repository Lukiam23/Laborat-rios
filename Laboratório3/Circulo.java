class Circulo extends Figura{
	
	float raio;

	Circulo(float x, float y, float raio){
		super(x,y);
		this.raio = raio;
	}

	String desenhar(){
		return this.toString();
	}

	void mover(float dx, float dy){
		this.x = dx;
		this.y = dy;
	}

	double calcularArea(){
		return raio*raio*3.14;
	}

	public String toString(){
		return "Círculo";
	}
}