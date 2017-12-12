package DecoratorPattern;

public class decoratordemo {
	
	public static void main(String args[]) {
		
		car midlevelcar=new midlevel(new basiccar());
		midlevelcar.manufacture();
		
	}

}
