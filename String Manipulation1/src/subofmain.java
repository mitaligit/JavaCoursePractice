/*Code to check if a given short string is a substring of a main string. Can you get a linear solution (O(n)) if possible?
*/
public class subofmain {
public static void main(String[] args)
{
	String str1 = "hellotest";
	String str2 = "lo";
	System.out.println(testsubstr(str1, str2));
}

	public static boolean testsubstr(String str1, String str2) {
		int index = 0;
		char[] m = str1.toCharArray();
		char[] s = str2.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			if (index != str2.length()) {
				if (m[i] == s[index]) {
					index++;
				} else {
					index = 0;
					if (m[i] == s[index]) {
						index++;
					}
				}
			}
		}
		if (index == str2.length()) {
			return true;
		} else {
			return false;
		}
	}
}
