import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
int a[]=new int[10];
int high=0;
int fail=0;
int pass=0;
int sum=0;
float avg=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the marks of ten students");
for(int i=0;i<10;i++)
{
a[i]=s.nextInt();
}
int low=a[1];
for(int j=0;j<10;j++)
{
if(a[j]>high)
high=a[j];

if(a[j]<low)
low=a[j];

if(a[j]<40)
fail=fail+1;
else
pass=pass+1;

sum=sum+a[j];
avg=sum/10;

}

System.out.println("Highest mark:"+high);
System.out.println("Lowest mark:"+low);
System.out.println("No.of students passed:"+pass);
System.out.println("No. students failed:"+fail);
System.out.println("Average marks:"+avg);
}
}
