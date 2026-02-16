package thidalx;

public class RearrangeWordsSolver {
	 public String rearrangeWords(String s) {
		 s = s.toLowerCase();
		 String[] strArr = s.split(" ");

		 for (int i = 0; i < strArr.length - 1; i++) {
		     for (int j = 0; j < strArr.length - i - 1; j++) {
		         if (strArr[j].length() > strArr[j + 1].length()) {
		             String temp = strArr[j];
		             strArr[j] = strArr[j + 1];
		             strArr[j + 1] = temp;
		         }
		     }
		 }

		 StringBuilder sb = new StringBuilder();
		 for(String i : strArr) {
			 sb.append(i+" ");
		 }
		 sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		 return sb.toString().trim();
	 }
	 public static void main(String[] args) {
		 RearrangeWordsSolver wordSolve = new RearrangeWordsSolver();
		 String input = "Leetcode makes me happy";
		 System.out.println(wordSolve.rearrangeWords(input));
	}
}
