
public class StringEndingWithFaelOrNot {
	public static void main(String[] args) {
		
		String Name1 = new String ("Love");
		String Name2 = new String ("Rafael");
		String Name3 = new String ("Larsfael");
		String Name4 = new String ("Emanuel");
		
		System.out.println("Names: \n"+Name1+"\n"+Name2+"\n"+Name3+"\n"+Name4+"\n\nLet's see which of these names are ending with 'fael' \n");
		
		System.out.println(Name1 + " ends with fael: " + Name1.endsWith("fael"));
		System.out.println(Name2 + " ends with fael: " + Name2.endsWith("fael"));
		System.out.println(Name3 + " ends with fael: " + Name3.endsWith("fael"));
		System.out.println(Name4 + " ends with fael: " + Name4.endsWith("fael"));
		
		if(Name1.endsWith("fael") != true) {
			System.out.println("\nShit... Names not ending with 'fael' were found!");
		}
	}
}