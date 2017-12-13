package ChainofCommandPattern;

public class solidpackagehandler implements packagehandler {

	packagehandler next;
	
	@Override
	public void setnext(packagehandler ph) {
		
		next=ph;
		
	}

	@Override
	public void handlerequest(pckg pkg) {
		
		if(pkg.type.equalsIgnoreCase("Solid")) {
			
			System.out.println("Handled the Solid object");
			
		} else if(pkg.type.equalsIgnoreCase("Liquid")) {
			next.handlerequest(pkg);
		}
		
	}

}
