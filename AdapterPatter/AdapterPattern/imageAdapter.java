package AdapterPattern;

public class imageAdapter implements imagerender{

	Advancedimageprocessor aip;
	
	
	public imageAdapter(String imagetype) {
		
		if(imagetype.equalsIgnoreCase("JPEG")) {
			
			System.out.println("Creating object ");
			
			aip=new jpegimage();
		}
		else if(imagetype.equalsIgnoreCase("PNG")){
			
			System.out.println("Creating object ");
			aip=new pngimage();
		}
		
	}
	
	
	@Override
	public void displayimage(String imagetype, String path) {
		
		if(imagetype.equalsIgnoreCase("JPEG")) {
			System.out.println("displaying object ");
			aip.jpegdisplay(path);
		}
		else if(imagetype.equalsIgnoreCase("PNG")) {
			System.out.println("displaying object ");
			aip.pngdisplay(path);
		}
	}
	

}
