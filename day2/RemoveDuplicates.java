package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="We learn java basics as part of java sessions in java week1";
		String[] split = str.split(" ");
	
	for(int i=0;i<split.length;i++)
		{
		int count=0;
		//System.out.println(split[i]);
	     for(int j=i+1;j<split.length;j++)
	     {
	    	 if ( split[i].equals(split[j]))
	    	 {
	    		count++;//
	    		 }
	     }
	     if (count>=1)					
			{
				split[i]=split[i].replace(split[i], " ");
				//str=str.replace(split[i], "");
			}
		}   
	for (int i = 0; i < split.length; i++) {
		System.out.print(split[i]+" ");
	}
	//System.out.println(String.valueOf(str));
		} 

}
