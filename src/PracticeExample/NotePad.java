package PracticeExample;

public class NotePad {

	/*
	 * public static void main(String[] args) {
	 * 
	 * int n = 11; int count = 0;
	 * 
	 * for (int i = 1; i <= n; i++) {
	 * 
	 * if (n % i == 0) {
	 * 
	 * count++;
	 * 
	 * } }
	 * 
	 * if (count == 2) { System.out.println("Its Prime Number"); } else {
	 * System.out.println("Its Not Prime Number"); }
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args){
	 * 
	 * int a = 0; int b = 1; int c = 10; for(int i = 0; i<=c; i++){ int d =a+b;
	 * System.out.print(d+"  "); a=b; b=d;
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args){
	 * 
	 * int a = 153; int n=a; int rem; int sum =0; for(int i=0;i<=n;i++){
	 * 
	 * while(n!=0){
	 * 
	 * rem = n%10; sum = sum+(rem*rem*rem); n = n/10;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * if(sum==a){ System.out.println("Its Armstrong Number"); }
	 * 
	 * else{ System.out.println("Its Not Prime Number"); }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * int n = 2029; if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0)) {
	 * System.out.println("Its Leap Year"); } else {
	 * System.out.println("Its Not Leap Year"); } }
	 */

	/*
	 * public static void main(String[] args){
	 * 
	 * String a = "Madam"; String b ="";
	 * 
	 * for(int i=a.length()-1;i>=0;i--){
	 * 
	 * b = b+ a.charAt(i);
	 * 
	 * } System.out.println(b); }
	 */

	public static void main(String[] args) {
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
