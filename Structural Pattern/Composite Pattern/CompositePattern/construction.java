package CompositePattern;

import java.util.ArrayList;

public class construction extends make{
	
	ArrayList<make> components= new ArrayList<make>();
	

	@Override
	public void build() {
		
		for(make structures: components) {
			structures.build();
		}
		
	}
	
	
	public void addstructure(make component) {
		components.add(component);
	}


}
