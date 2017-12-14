package ObserverPattern;

import java.util.Observable;

public class obsrvvalue extends Observable {
	
	private int val=0;
	
	public obsrvvalue(int newval) {
		this.val=newval;
	}
	
	public void setnewval(int newval) {
		this.val=newval;
		setChanged();
		notifyObservers();
	}
	
	

}
