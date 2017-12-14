package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class observerobject implements Observer{
	
	
	private obsrvvalue obs=null;
	
	public observerobject(obsrvvalue o) {
		this.obs=o;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0==arg1) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("The value is updated");
		}
		
	}

}
