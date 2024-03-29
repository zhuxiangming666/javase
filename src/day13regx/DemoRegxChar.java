package day13regx;

public class DemoRegxChar {
//	[abc] a、b 或 c（简单类） 
//	[^abc] 任何字符，除了 a、b 或 c（否定） 
//	[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
//	[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
//	[a-z&&[def]] d、e 或 f（交集） 
//	[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
//	[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 
	public static void main(String[] args) {
		String regx="[a-z&&[^m-p]]";
		System.out.println("a".matches(regx));
		System.out.println("ab".matches(regx));
	}
	
}
