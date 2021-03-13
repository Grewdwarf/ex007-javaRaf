public class StringsCaseSensitivity {
	public static void main(String[] args) {
		
		String A = new String ("Stockholm");
		String B = new String ("MALMÖ");
		String C = new String ("STOCKHOLM");
		
		System.out.println("Facit: \nA -> "+A+"\nB -> "+B+"\nC -> "+C+"\n");
		
		System.out.println("A equals to B: " + A.equals(B));
		System.out.println("A equals to C: " + A.equals(C));
		System.out.println("A equals to Malmö: " + A.equals("Malmö"));
		System.out.println("A equals to Stockholm: "+ A.equals("Stockholm"));
		System.out.println("B equals to sthlm: " + B.equals("sthlm"));

		
	}
}