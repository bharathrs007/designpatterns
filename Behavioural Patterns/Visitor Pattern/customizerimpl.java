package VisitorPattern;

public class customizerimpl implements customizer {
	
	

	@Override
	public void addcomponent(windowshield w) {
		
		System.out.println("Adding windshield of color: "+w.color);
		
	}

	@Override
	public void addcomponent(wheel wl) {
		
		System.out.println("Adding wheel of style: "+wl.style);
		
	}

	@Override
	public void addcomponent(stripes s) {
		
		System.out.println("Adding stripes of style: "+s.stripestyle);
		
	}

}
