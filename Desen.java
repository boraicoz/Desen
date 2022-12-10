import java.util.Scanner;

public class Desen{


 //Geriye Dogru alan
 public static int pattern(int n,boolean key,int temp){
if(key&&n==temp)
{
    System.out.print(n);
    return n;
}

if(n<=0)
{
    key=true;
    System.out.print(n+" ");
    return pattern(n+5,key,temp);
}
if(key){
    System.out.print(n+" ");
    return pattern(n+5,key,temp);

}
else
{
    System.out.print(n+" ");
    return pattern(n-5,key,temp);
}

 }






    public static void main(String[] args) {
        // scanner method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int number= input.nextInt();
        boolean key=false;
        int temp=number;
        pattern(number,key,temp);
    }
}