import java.util.*;
public class a39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("Enter a character : ");
		Scanner obj=new Scanner( System.in);
		char ch=obj.next( ).charAt (0);
		switch(ch)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
		i++;
		}
		if(i==1)
		System.out.println(" character "+ch+" is Vowel");
		else
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("character "+ch+" is Consonent");
		else
		System.out.println("Not analphabet");
		

	}

}
