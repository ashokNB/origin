/*
 	University of Mary Hardin-Baylor
	Master of Science in Information Systems Curriculum
	BCIS 6360 - Applied Programming

	Programming Exercise based on:

	McGrath, Mike "Java in easy steps, 6th ed"
	c 2014 Easy Steps Ltd. Warwickshire, UK

*/

class Args
{
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Wrong num of args");
			return;
		}

	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[2]);
	String msg = args[0]+args[1]+args[2]+"=";

	if (args[1].equals("+")) msg += (num1 + num2);
        else if (args[1].equals("-")) msg += (num1 - num2);
        else if (args[1].equals("x")) msg += (num1 * num2);
        else if (args[1].equals("/")) msg += (num1 / num2);
	else msg = "Incorrect Operator";

	System.out.println(msg);
	}
}

/* Output

$ java Args 16 + 4
16+4=20
$ java Args 16 - 4
16-4=12
$ java Args 16 x 4
16x4=64
$ java Args 16 / 4
16/4=4
$ java Args 16 / 
Wrong num of args

*/
