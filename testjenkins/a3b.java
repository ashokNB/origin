class a3b 
{
	public static void main(String[] args) 
	{
		try
		{
			if(args.length<3)
			{
				throw new Exception("Insufficient inputs \n Number of inputs should be 3\n");
			}
			else if(args.length>3)
			{
				throw new Exception("Too many arguments \n Number of inputs should be 3\n");
			}
			else
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
				
				for(int k=0;k<args.length;k++)
				{
					String inputName=args[k];
					System.out.println("Input "+(k+1)+" is "+args[k]);
					for(int x=0;x<inputName.length();x++)
					{
						int flag=0;
						for(int y=0;y<arrayAlpha.length;y++)
						{
						if(arrayAlpha[y].equalsIgnoreCase(String.valueOf(inputName.charAt(x))))
						{
							System.out.println("The Value of Character "+inputName.charAt(x)+" is "+(y+1));
							flag=1;
							break;
						}
						}
						
						if(" ".equalsIgnoreCase(String.valueOf(inputName.charAt(x))))
						{
							System.out.println("The Value of Character "+inputName.charAt(x)+" is 0");
							flag=1;
						}
						if(flag==0)
						{
							System.out.println("The Value of Character "+inputName.charAt(x)+" is defaulted to 0");
						}
					}
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
