// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String a = args[0];
		String b = args[1];
		String c = args[2];
		double amount = Double.parseDouble(args[3]);
		double amountPerPerson = Math.ceil(amount/3);

	    String str = "Dear " + c + ", " + b + " and " + a + ": pay " + amountPerPerson + " Shekels each";
		System.out.println(str);
	}
}
