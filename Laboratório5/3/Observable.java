interface Observable{
	void addObserver(Observer obj);
	void deleteObserver(Observer obj);
	void notifyObservers(double e);
}