package AdapterPattern;

public class pngimage implements Advancedimageprocessor {
	
	
	public pngimage() {
		System.out.println("Inside class png image");
	}

	@Override
	public void jpegdisplay(String path) {
		
		
	}

	@Override
	public void pngdisplay(String path) {
		
		System.out.println("Displaying png image from the path: "+path);
		
	}
	
}
