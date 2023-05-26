package SolvedQuestions;

//Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
//If the string length is less than 2, use whatever chars are there.
//
//
//front22("kitten") → "kikittenki"
//front22("Ha") → "HaHaHa"
//front22("abc") → "ababcab"
public class TakeFirstTwoCharAndAddToFirstAndLast {

	public  String front22(String str) {
		String result="";
		  char ch;
		  int requirement=2;
		  if(requirement>=str.length())
		  {
		  for(int i=0;i<=1;i++)
		  {
		    ch=str.charAt(i);
		    result = result+ch;
		  }
		  }
		  return result+str+result;
		  
		  //alternate code
		// First figure the number of chars to take
//		  int take = 2;
//		  if (take > str.length()) {
//		    take = str.length();
//		  }
//		  
//		  String front = str.substring(0, take);
//		  return front + str + front;
		  
		}
	public static void main(String[] args) {
		TakeFirstTwoCharAndAddToFirstAndLast obj = new TakeFirstTwoCharAndAddToFirstAndLast();
		try {
		System.out.println("After adding the string = "+obj.front22("he"));
	}
		catch(StringIndexOutOfBoundsException exp)
		{
			System.out.println(exp.getMessage());
		}
}
}