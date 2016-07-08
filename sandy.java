import java.io.*;
class sandy
{
public static void main(String[] args)throws IOException
{
int a;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(b.readLine());
if(a>0)
{
System.out.println("No.pos");
}
else if(a<0)
{
System.out.println("No.negs");
}
else
{
System.out.println("Zero");
}}}