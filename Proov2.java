public class Proov2{
	public static void main (String[] args){
		Silinder purk1=new Silinder(2 , 1);
		Silinder purk2=new Silinder(5 , 6);
		Silinder purk3=new Silinder(2 , 1.5);
		System.out.println(purk1.ruumala());
		System.out.println(purk2.ruumala());
		System.out.println(purk3.ruumala());
		System.out.println(purk1.taispindala());
		System.out.println(purk2.taispindala());
		System.out.println(purk3.taispindala());
		System.out.println(purk1.kylgpindala());
		System.out.println(purk2.kylgpindala());
		System.out.println(purk3.kylgpindala());
		System.out.println(purk1);
		System.out.println(purk2.toString());
		System.out.println(purk3.toString());
		
		
	}
}