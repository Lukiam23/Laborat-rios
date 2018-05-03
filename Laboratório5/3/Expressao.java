import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

abstract class Expressao implements Observable{
	List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer obj){
		this.observers.add(obj);
	}
	
	@Override
	public void deleteObserver(Observer obj){
		this.observers.remove(obj);
	}
	
	@Override
	public void notifyObservers(double e){
		
		Iterator elements = this.observers.iterator();
		
		while(elements.hasNext()){
			Observer item = (Observer) elements.next();
			item.imprimir(e);
		}
	}
	
	public abstract double calcular();
}