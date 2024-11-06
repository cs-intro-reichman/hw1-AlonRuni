// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double amount = Double.parseDouble(args[3]);
		double amountPerPerson = Math.ceil(amount/3);

	    String str = "Dear " + name3 + ", " + name2 + " and " + name1 + ": pay " + amountPerPerson + " Shekels each.";
		System.out.println(str);
	}
}
