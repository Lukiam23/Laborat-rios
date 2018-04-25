import java.util.*;
abstract class Observable{
	List observers = new ArrayList();

	void addObserver(Observer obj){
		observers.add(obj);
	}
	void deleteObserver(Observer obj){
		observers.remove(obj);
	}
	void notifyObservers(){
		Iterator elements = new Iterator(observers);
		while (elements.hasNext()){
			(elements.next()).imprimir();
		}
	}
}