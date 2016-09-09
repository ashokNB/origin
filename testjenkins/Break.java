/*
 	University of Mary Hardin-Baylor
	Master of Science in Information Systems Curriculum
	BCIS 6360 - Applied Programming

	Programming Exercise based on:

	McGrath, Mike "Java in easy steps, 6th ed"
	c 2014 Easy Steps Ltd. Warwickshire, UK

*/

class Break
{
	public static void main(String[] args){
		for (int i =1; i<4; i++)
		{
			for (int j = 1; j<4; j++)
			{
				System.out.println("Running i="+i+" j="+j);
			}
		}
	}
}

/* Output

Running i=1 j=1
Running i=1 j=2
Running i=1 j=3
Running i=2 j=1
Running i=2 j=2
Running i=2 j=3
Running i=3 j=1
Running i=3 j=2
Running i=3 j=3

*/
