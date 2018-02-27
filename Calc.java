// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

public class Calc
{
	public static void main (String[] args) {
		System.out.println(add(1,2));
		System.out.println(sub(2,1));
	}
   static public int add (int a, int b)
   {
      return a + b;
   }
   static public int sub(int a, int b) {
	   return a-b;
   }
}
