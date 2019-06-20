public class Stringies {
	public static void main(String[] args) {
		
		String s1 = new String("The quick brown fox");
		String s2 = s1.concat(" dog.");
		System.out.println(s2.length());
		String s3 = s1.substring(0, 19);
		String s4 = s2.substring(19, 24);
		String s5 = s3.concat(" jumped over the ").concat(s4);
		
		System.out.println(s5);
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		String[] s6 = s5.split(" ");
		System.out.println(s6.length);
		System.out.println(s5.replace(" jumped over", " "));
	}
}
