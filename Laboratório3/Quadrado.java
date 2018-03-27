class Quadrado extends Figura implements Colorida{

	float lado;
	String cor;

	Quadrado(float x, float y, float lado, String cor){
		super(x,y);
		this.lado = lado;
		this.cor = cor;
	}

	Quadrado(float x, float y, float lado){
		super(x,y);
		this.lado = lado;
		this.cor = "";
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

	@Override
	public void setCor(String cor){
		this.cor = cor;
	}

	@Override
	public String getCor(){
		return this.cor;
	}

	@Override
	public boolean colorida(){
		return !cor.equals("");
	}

	public String toString(){
		return "Quadrado";
	}
}