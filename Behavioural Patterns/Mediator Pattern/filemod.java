package MediatorPattern;

public class filemod {
	
	String modname;
	File filename;
	
	public filemod(String name, File file) {
		this.modname=name;
		this.filename=file;
	}
	
	public void modifyfile(File f) {
		System.out.println("Modifying file : "+f.filename);
	}

}
