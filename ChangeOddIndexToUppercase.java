package week1.day2;
//bbbb
public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] charArray = test.toCharArray();
		System.out.println("odd index of changeme are");
	for(int i=0;i<charArray.length;i++)
	{ 
	if (i%2!=0)
	{
		charArray[i]=Character.toUpperCase(charArray[i]);
		//String string = charArray.toString();
		System.out.print(charArray[i]);
		
	}
	else
		System.out.print(charArray[i]);
	}
}
}

