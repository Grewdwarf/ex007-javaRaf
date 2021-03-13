
public class StringsEqualOrNot {
	public static void main(String[] args) {
		
		String A = new String ("Stockholm");
		String B = new String ("MALMÖ");
		String C = new String ("STOCKHOLM");
		
		System.out.println("Facit: \nA -> "+A+"\nB -> "+B+"\nC -> "+C+"\n");
		
		System.out.println("A equals to B: " + A.equalsIgnoreCase(B));
		System.out.println("A equals to C: " + A.equalsIgnoreCase(C));
		System.out.println("A equals to Malmö: " + A.equalsIgnoreCase("Malmö"));
		System.out.println("A equals to Stockholm: "+ A.equalsIgnoreCase("Stockholm"));
		System.out.println("B equals to sthlm: " + B.equalsIgnoreCase("sthlm"));
	}
}