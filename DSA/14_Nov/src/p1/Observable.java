package p1;

public interface Observable {

	 void subscribeObserver(Observer obs1);
	    void removeObserver(Observer obs1);
	    void notifyObservers();

}
