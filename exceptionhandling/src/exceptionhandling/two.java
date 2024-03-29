package exceptionhandling;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int a[]={1,3,5,6};
		System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}