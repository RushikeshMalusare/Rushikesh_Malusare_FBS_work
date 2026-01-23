package p1;

public class Test{
	
	public static void main(String[] args) {
		
		Whether w1 = new Whether();

         Mobile m1 = new Mobile(w1);
         Mobile m2 = new Mobile(w1);//not compulcoury

        w1.subscribeObserver(m1);
        w1.subscribeObserver(m2);

        w1.setTemperature(30.5f);
        w1.setTemperature(32.2f);
    }
	}
