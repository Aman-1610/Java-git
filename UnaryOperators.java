import java.util.Scanner;
class UnaryOperators
{
   public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int result=0;
        result=++num;
        System.out.println("Value after pre increment: "+result);
        result=num++;
        System.out.println("Value after post increment: "+result);
        result=--num;
        System.out.println("Value after pre decrement: "+result);
        result=num--;
        System.out.println("Value after post decrement: "+result);
        result=~num;
        System.out.println(num+"bitwise complement: "+result);
        System.out.println("Actual value of result: "+result);
        boolean results=!(result<num);
        System.out.println("!(result<num): "+results);
      }
}