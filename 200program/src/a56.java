
public class a56
{
public static void main(String args[] )
{
int i;
System.out.println("The numbers which are divisible by both 3 and 7 from 1 to 100:");
for(i = 1; i <= 100; i++)
{

if((i%3) == 0 && (i%7)==0)
System.out.println(+i);
}
}
}