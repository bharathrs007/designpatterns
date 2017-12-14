package StatePattern;

public class windshieldcontext implements eventstate {
	
	eventstate es;
	
	public void setcontext(eventstate e) {
		this.es=e;
	}

	@Override
	public void performaction() {
		
		this.es.performaction();
		
	}

}
