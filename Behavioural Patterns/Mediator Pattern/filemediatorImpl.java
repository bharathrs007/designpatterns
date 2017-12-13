package MediatorPattern;

import java.util.ArrayList;

public class filemediatorImpl implements ifilemediator{
	
	ArrayList<filemod> fm=new ArrayList<filemod>();
	
	ArrayList<File> f=new ArrayList<File>();
	

	@Override
	public void addrequest(filemod f) {
		
		System.out.println("Adding request :"+f.modname+ " into the queue");
		fm.add(f);
		
	}

	@Override
	public void givecontrol(File f, filemod fm) {
		
		System.out.println("Giving control to filemod "+fm.modname+" over the file "+f.filename);
		fm.modifyfile(f);
		
	}

	@Override
	public void addfile(File f) {
		
		System.out.println("Fetching file "+f.filename+ " for modification");
		
	}

}
