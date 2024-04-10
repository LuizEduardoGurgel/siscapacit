package secao03;

public class TesteString {

	public static void main(String[] args) {
		
		String s1 = "Salve";
		String s2 = "Salve";
		String s3 = s1;
		String s4 = new String("Salve");
		String s5  = new String("Salve");
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		

	}

}
