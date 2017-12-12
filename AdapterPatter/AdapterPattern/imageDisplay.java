package AdapterPattern;

public class imageDisplay implements imagerender{

	imageAdapter iA;
	
	public imageDisplay() {
		System.out.println("Inside imageDisplay");
	}
	
	@Override
	public void displayimage(String imagetype, String path) {
		
		System.out.println("Displaying "+ imagetype+" in path "+path);
		
		iA=new imageAdapter(imagetype);
		iA.displayimage(imagetype, path);
		
	}
	
	

}
