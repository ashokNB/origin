import java.io.*;
import java.util.*;

class ArraysDemo{

	public static void main(String[] args){
		int[] arrayValue = new int[27];
		String[] arrayAlpha = new String[27];
		
		arrayValue[0] = 0;
		arrayAlpha[0] = "";

		for(int i=1;i<=26;i++){
			arrayValue[i] = i;
			arrayAlpha[i] = String.valueOf((char)(i+64));
			System.out.println(arrayAlpha[i]+"    "+arrayValue[i]);

		}
	}
}
