package MediatorPattern;

public interface ifilemediator {
	
	public void addrequest(filemod f);
	
	public void addfile(File f);
	
	public void givecontrol(File f, filemod fm);
	

}
