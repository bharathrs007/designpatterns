package InterpretorPattern;

public class currencyconvertor {
	
	double cusdtoinr=60.0;
	double cusdtoeur=1.3;
	
	public double getusdtoinr(double sourceamount) {
		return sourceamount*cusdtoinr;
	}
	
	public double getusdtoeur(double sourceamount) {
		return sourceamount * cusdtoeur;
	}

}
