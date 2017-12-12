package AdapterPattern;

public class jpegimage implements Advancedimageprocessor {
	
	public jpegimage() {
		System.out.println("Inside class jpeg image");
	}

	@Override
	public void jpegdisplay(String path) {
		
		System.out.println("Displaying jpeg image from the path: "+path);
		
	}

	@Override
	public void pngdisplay(String path) {
		// TODO Auto-generated method stub
		
	}

	

}
