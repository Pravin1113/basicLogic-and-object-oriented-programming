
public class a68
{
public static void main(String args[])
{
long i,j,k,count,first,last,sum=0,fact=1;
for ( i= 2; i<= 5; ++i )
{
count=0;
for ( k=2; k<=i/2; k++ )
{
if (( i % k ) == 0 )
{
count++;
}
}
if ( count==0 )
{
fact=1;
for ( j=1;j<=i;j++ )
{
fact*=j;
}
sum+=fact;
}
}
System.out.println("\n Sum of prime numbers factorial is: "+sum);
}
}
