public class primeforeach {
    public static void main(String args[])
    {
        int num[]={1,2,3,4,5,6,7,8,9,10};
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
