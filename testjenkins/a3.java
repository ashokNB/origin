class a3 
{
	public static void main(String[] args) 
	{
	int [] arrayValue = new int[27];
	String [] arrayAlpha = new String[26];

	for (int i=0;i<=26;i++)
	{
	    arrayValue[i]=i;
	}
	char var='A';
	int j=0;
 	for(var='A',j=0;var<='Z';var++,j++)
	{
		arrayAlpha[j]=String.valueOf(var);
	}
	System.out.println("arrayValue : \n");
	for(int i=0;i<arrayValue.length;i++)
	{
		System.out.print(arrayValue[i]+" ");
	}
	System.out.println("\n\narrayAlpha : \n");
	for(int i=0;i<arrayAlpha.length;i++)
	{
		System.out.print(arrayAlpha[i]+ " ");
	}
	}
}
