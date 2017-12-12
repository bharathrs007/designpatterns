package FacadePattern;

public class housefacade {
	
	private walls wall=new walls();
	private roofs roof=new roofs();
	
	public void build() {
		wall.buildwalls();
		roof.buildroofs();
	}

}
