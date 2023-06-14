package week1.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] charArray = test.toCharArray();
		System.out.println("After odd index change");
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

