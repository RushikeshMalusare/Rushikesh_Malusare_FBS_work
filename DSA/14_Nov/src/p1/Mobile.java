package p1;

public class Mobile implements Observer {
	
	private float temp;
	Observable Whether;
	
	public Mobile() {
		
	}
	
	public Mobile(Observable v1) {
		Whether =v1;
		v1.subscribeObserver(this);
	}

	public void update(float temp) {
		this.temp=temp;
		
		displayCurrTemp();
	}
	private void displayCurrTemp() {
		System.out.println(" Current Temperature is: " + temp);
	}
		
	
}
