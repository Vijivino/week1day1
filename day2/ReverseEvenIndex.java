package week1.day2;

public class ReverseEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="I am an software tester at mnc";
		String[] split = test.split(" ");
		for(int i=0;i<split.length;i++)
		{
			if (i%2 == 0)
			{
				String str = split[i].toString();
				char[] charArray = str.toCharArray();
				for(int j=charArray.length-1;j>=0;j--)
				{
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else 
			{
				System.out.print(split[i]+ " ");
			}
		}
}
	
}
