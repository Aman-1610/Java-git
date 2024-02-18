import java.util.*;
public class Arrayfromuserinforeach {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of an array: ");
            int n = sc.nextInt();
            int num[]=new int[n];
            System.out.print("Enter the elements of array: ");
            for(int i=0;i<n;i++)
            num[i]=sc.nextInt();
            
            for(int x:num)
            {
                if(x<=3)
                {
                    System.out.println(x+" is a prime number.");
                }
                for(int i=2;i<=x/i;i++)
                {
                    if((x%i)==0)
                    {
                        System.out.println(x+" is not a prime number.");
                    }
                    else{
                        System.out.println(x+" is a prime number.");
                    }
                }
            }
        }
    }
    

