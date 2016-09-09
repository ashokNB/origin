/*
 	University of Mary Hardin-Baylor
	Master of Science in Information Systems Curriculum
	BCIS 6360 - Applied Programming

	Programming Exercise based on:

	McGrath, Mike "Java in easy steps, 6th ed"
	c 2014 Easy Steps Ltd. Warwickshire, UK

*/

class Break3
{
	public static void main(String[] args){
		for (int i =1; i<4; i++)
		{
			for (int j = 1; j<4; j++)
			{
				if (i==1 && j==1) // Added in Break3
				{
					System.out.println("Continues in lp at i="+i+" and j="+j);
					continue;
				}
				if (i==2 && j==1) // Added in Break2
				{
					System.out.println("Breaks in lp at i="+i+" and j="+j);
					break;
				}
				System.out.println("Running i="+i+" j="+j);
			}
		}
	}
}

/* Output

Continues in lp at i=1 and j=1
Running i=1 j=2
Running i=1 j=3
Breaks in lp at i=2 and j=1
Running i=3 j=1
Running i=3 j=2
Running i=3 j=3

*/
