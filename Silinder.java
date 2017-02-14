public class Silinder{
	double h, c;
	public Silinder(double korgus, double raadius){
		if(korgus<=0){throw new RuntimeException("Sobimatu korgus");}
		if(raadius<=0){throw new RuntimeException("Sobimatu raadius");}
		h=korgus;
		c=raadius;
	}
	public double ruumala(){
		return 3.14*(c*c)*h;
	}	
	public double taispindala(){
		return 2*3.14*(c*c)+2*3.14*c*h;
	}
	public double kylgpindala(){
		return 2*3.14*c*h;
		
	}
	public double ringipindala(){
		return 3.14*(c*c);
		
	}
	

	public String toString(){
		return "Silindri ruumala on "+ruumala()+" kuupmeetrit. Taispindala on "+taispindala()+" ruutmeetrit. Kulgpindala on "+kylgpindala()+" ruutmeetrit. Ringipindala on "+ringipindala()+" ruutmeetrit.";
	}
}