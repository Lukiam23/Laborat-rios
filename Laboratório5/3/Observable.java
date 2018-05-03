//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
interface Observable{
	void addObserver(Observer obj);
	void deleteObserver(Observer obj);
	void notifyObservers(double e);
}