/*
 	University of Mary Hardin-Baylor
	Master of Science in Information Systems Curriculum
	BCIS 6360 - Applied Programming

	Programming Exercise based on:

	McGrath, Mike "Java in easy steps, 6th ed"
	c 2014 Easy Steps Ltd. Warwickshire, UK

*/

class Bitwise
{
	public static void main(String[] args){
		int fs = 53; // Combined flag status of 00110101
		System.out.println("Flag 1: " + (( (fs&1)> 0) ? "ON" : "off"));
                System.out.println("Flag 2: " + (( (fs&2)> 0) ? "ON" : "off"));
                System.out.println("Flag 3: " + (( (fs&4)> 0) ? "ON" : "off"));
                System.out.println("Flag 4: " + (( (fs&8)> 0) ? "ON" : "off"));
                System.out.println("Flag 5: " + (( (fs&16)> 0) ? "ON" : "off"));
                System.out.println("Flag 6: " + (( (fs&32)> 0) ? "ON" : "off"));
                System.out.println("Flag 7: " + (( (fs&64)> 0) ? "ON" : "off"));
                System.out.println("Flag 8: " + (( (fs&128)> 0) ? "ON" : "off"));
		}
}

/* OUTPUT

Flag 1: ON
Flag 2: off
Flag 3: ON
Flag 4: off
Flag 5: ON
Flag 6: ON
Flag 7: off
Flag 8: off

*/
