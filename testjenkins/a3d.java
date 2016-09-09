class a3d 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(args.length);
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
				System.out.println("Displaying the value of a word");
				
					String Name=args[1];
					int sum=0;
					System.out.println("Alphabet\tValue\t\tTotal");
					
					for(int x=0;x<Name.length();x++)
					{
						
						int flag=0;
						for(int y=0;y<arrayAlpha.length;y++)
						{
						if(arrayAlpha[y].equalsIgnoreCase(String.valueOf(Name.charAt(x))))
						{
							System.out.print(Name.charAt(x)+"\t\t");
							System.out.print((y+1)+"\t\t");
							sum=sum+(y+1);
							System.out.print(sum+"\n");
							flag=1;
							break;
						}
						}
						
						if(" ".equalsIgnoreCase(String.valueOf(Name.charAt(x))))
						{
							System.out.print("\" \""+"\t0\t");
							sum=sum+0;
							System.out.print(sum+"\n");
							flag=1;
						}
						if(flag==0)
						{
							System.out.print(Name.charAt(x)+"\t");
							System.out.print("0\t");
							sum=sum+0;
							System.out.print(sum+"\n");
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

