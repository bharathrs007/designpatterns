package VisitorPattern;

import java.util.ArrayList;

public class visitordemo {

	public static void main(String[] args) {
		
		ArrayList<customizable> customcomp=new ArrayList<customizable>();
		customcomp.add(new windowshield("Blue"));
		customcomp.add(new wheel("Yokohama Pro ++"));
		customcomp.add(new stripes("Stripe1"));
		
		customizer creator=new customizerimpl();
		
		for(customizable tempc: customcomp) {
			tempc.addtocar(creator);
		}

	}

}
