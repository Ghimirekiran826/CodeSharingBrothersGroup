package SolvedQuestions;

public class ExchangingFirstandLastCharacterofString {
	public String frontBack(String str) {
		  char ch1,ch2;
		  int l=str.length()-1;
		  for(int i=0;i<str.length();i++)
		  {
		    if(i==0){
		    ch1 = str.charAt(i);
		    }
		    if(l==str.length()-1)
		    {
		    ch2 = str.charAt(i);
		    }
		  }
		  return ch2+str+ch1;
		}

	public static void main(String[] args) {
		
	}
}
