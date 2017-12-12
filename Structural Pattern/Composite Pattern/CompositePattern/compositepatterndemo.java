package CompositePattern;

public class compositepatterndemo {
	
	public static void main(String args[]) {
		
		make wls=new walls();
		make rf=new roof();
		
		construction ctr=new construction();
		ctr.addstructure(wls);
		ctr.addstructure(rf);
		
		ctr.build();
		
	}

}
