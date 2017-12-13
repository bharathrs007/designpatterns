package ChainofCommandPattern;

public class liquidpackagehandler implements packagehandler{
	
	packagehandler next;

	@Override
	public void setnext(packagehandler ph) {
		
		next=ph;
		
	}

	@Override
	public void handlerequest(pckg pkg) {
		
		if(pkg.type.equalsIgnoreCase("Liquid")) {
			
			System.out.println("Handled the Liquid object");
			
		} else if(pkg.type.equalsIgnoreCase("Solid")) {
			next.handlerequest(pkg);
		}
		
	}
	
	

}
