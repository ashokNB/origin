/*
 	University of Mary Hardin-Baylor
	Master of Science in Information Systems Curriculum
	BCIS 6360 - Applied Programming

	Programming Exercise based on:

	McGrath, Mike "Java in easy steps, 6th ed"
	c 2014 Easy Steps Ltd. Warwickshire, UK

*/

class Array
{
	public static void main(String[] args) {
		String[] str={"Much","More","Java"};
		int[] num = new int[3];
		num[0]=100;
		num[1]=200;
		str[1]="Better";
		System.out.println("String array length is "+str.length);
                System.out.println("Integer array length is "+num.length);
                System.out.println(num[0]+","+num[1]+","+num[2]);
                System.out.println(str[0]+str[1]+str[2]);
	}
}

/* Output

String array length is 3
Integer array length is 3
100,200,0
MuchBetterJava

*/
