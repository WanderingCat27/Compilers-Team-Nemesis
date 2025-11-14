import java.util.*;
public class SimpleProgram {
static Scanner in = new Scanner(System.in);
public static void main(String[] args) throws Exception {
int n=0;
System.out.println("input n: ");
n=in.nextInt();
double firstVal=0.0;
System.out.println("input firstVal: ");
firstVal=in.nextFloat();
double total=firstVal;
double mn=firstVal;
double mx=firstVal;
int pos=0;
int neg=0;
int zero=0;
if(firstVal>0.0)
{
pos=1;
}
else
if(firstVal<0.0)
{
neg=1;
}
else
{
zero=1;
}
int i=1;
while(i<n) {
double x=0.0;
System.out.println("input x: ");
x=in.nextFloat();
total=total + x;
if(x<mn)
{
mn=x;
}
if(x>mx)
{
mx=x;
}
if(x>0.0)
{
pos=pos + 1;
}
else
if(x<0.0)
{
neg=neg + 1;
}
else
{
zero=zero + 1;
}
i=i + 1;
}
System.out.println(0.0);
}
}
