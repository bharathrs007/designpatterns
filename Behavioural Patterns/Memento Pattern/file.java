package Memento;

public class file {
	
	public String filedata;
	filesavedstate fs;
	public file(String content) {
		this.filedata=content;
	}
	
	public void savestate() {
		fs=new filesavedstate(this.filedata);
	}
	
	public void getsaveddata() {
		String saveddata=fs.getdata();
		System.out.println("The saved data is :"+saveddata);
	}
	

	public static void main(String[] args) {
		
		file f=new file("Trying to show a demo");
		f.savestate();
		f.getsaveddata();
	}

}
