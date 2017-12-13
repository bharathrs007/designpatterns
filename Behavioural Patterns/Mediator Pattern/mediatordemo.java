package MediatorPattern;

public class mediatordemo {

	public static void main(String[] args) {
		
		ifilemediator fmed=new filemediatorImpl();
		File file=new File("demo.txt");
		filemod fm=new filemod("moddemo",file);
		fmed.addrequest(fm);
		fmed.addfile(file);
		fmed.givecontrol(file, fm);

	}

}
