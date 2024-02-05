
class Explicit
{
    public static void main(String args[])
    {
        double i = 100.25;
        short j = (short) i;
        int k = (int) i;
        System.out.println("Original value: "+i);
        System.out.println("After type casting to short: "+j);
        System.out.println("After type casting to integer: "+k);
    }
}
