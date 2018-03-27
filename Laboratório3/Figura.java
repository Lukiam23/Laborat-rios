abstract class Figura{
	
	float x;
	float y;

	Figura(float x, float y){
		this.x = x;
		this.y = y;
	}

	abstract String desenhar();
	abstract void mover(float dx, float dy);
	abstract double calcularArea();
}