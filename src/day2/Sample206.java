package day2;

public class Sample206 {
	
	public static void main(String[] args) {
		final int NUMBER = 100;
		final String STRING = "HOGE";
		System.out.println(NUMBER);
		System.out.println(STRING);
		
		//	finalがついた変数は値を替えられない（定数）
		NUMBER = 100;
		STRING = "fuga";
	}
}
