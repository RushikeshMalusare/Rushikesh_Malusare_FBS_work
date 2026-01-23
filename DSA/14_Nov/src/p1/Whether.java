package p1;

import java.util.ArrayList;
import java.util.List;

public class Whether implements Observable {
	
	    private List<Mobile> observers = new ArrayList<>();
	    private float temp;

	    public void setTemperature(float temp) {
	        this.temp = temp;
	        notifyObservers();   // notify all mobiles
	    }
	    

	    @Override
	    public void subscribeObserver(Observer obs1) {
	        observers.add((Mobile) obs1);
	    }
	    
	    @Override
		public void removeObserver(Observer obs1) {
		
	    	if(observers.contains(obs1)) {
	    		int index=observers.indexOf(obs1);
	    		observers.remove(index);
	    	}
	    	else {
	    		System.out.println("Observer Does Not Exit");
	    	}
			
		}
	    
	    @Override
	    public void notifyObservers() {
	        for (Mobile m : observers) {
	            m.update(temp);
	        }
	    }
	    public void tempChange() {
	    	notifyObservers();
	    }
	    public void changeTemp(float temp) {
	    	this.temp=temp;
	    	tempChange();
	    }
	}




//	float temp;
//	Observable Whether;
//	
//	@Override
//	public void update(float temp) {
//		 this.temp=
//		 changetemp();
//		
//	}
//
//	private float changetemp() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void subscribeObserval(Mobile mobile) {
//		// TODO Auto-generated method stub
//		
//	}

	
	

		

