package ChainofCommandPattern;

public class chainofcommandclient {
	
	public static void main(String args[]) {
		
		packagehandler pckg1=new solidpackagehandler();
		packagehandler pckg2=new liquidpackagehandler();
		
		pckg1.setnext(pckg2);
		
		pckg1.handlerequest(new pckg("Solid"));
		pckg2.handlerequest(new pckg("Liquid"));
		
	}

}
