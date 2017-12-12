package AdapterPattern;

public class adapterClient {

	public static void main(String[] args) {
		
		imageDisplay iD = new imageDisplay();
		iD.displayimage("PNG", "C:\test1");
		//iD.displayimage("JPEG", "C:\test2");

	}

}
