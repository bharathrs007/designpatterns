package InterpretorPattern;

public class usdtoinr implements convertor{

	private double amt;
	
	public usdtoinr(double curr) {
		this.amt=curr;
	}
	
	@Override
	public double convert(currencyconvertor cc) {
		return cc.getusdtoinr(amt);
	}

}
