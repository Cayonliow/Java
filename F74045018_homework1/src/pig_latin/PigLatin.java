package pig_latin;

public class PigLatin {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String[] data;
		data = new String[args.length];
		for (int i = 0; i < args.length; i++)
		{
			data[i] = new String(args[i]);
		
			if(data[i].charAt(0)=='a'||data[i].charAt(0)=='e'||data[i].charAt(0)=='i'||data[i].charAt(0)=='o'|data[i].charAt(0)=='u')
			{
			}
			else
			{
				data[i] = data[i].substring(1, data[i].length()) + data[i].charAt(0);

			}
			data[i]=data[i].substring(0,1).toUpperCase()+data[i].substring(1);
			
			data[i]=data[i]+"ay";
			if(i>0)	System.out.print(" ");
		System.out.print(data[i]);
		}
		

	}
}

		
