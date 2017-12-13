package InterpretorPattern;

public class usdtoeur implements convertor {
	
	private double amt;
	
	public usdtoeur(double curr) {
		this.amt=curr;
	}

	@Override
	public double convert(currencyconvertor cc) {
		return cc.getusdtoeur(amt);
	}

}
