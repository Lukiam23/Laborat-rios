abstract class Observable{
	Observer observers[];
	void addObserver();
	void deleteObserver()();
	void notifyObservers(){
		for (o Observer : observers) {
			o.imprimir();
		}
	}
}