import java.io.*;
class BufferedReaderInput
{
   public static void main(String args[])throws Exception
     {
InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader bfn =new BufferedReader(r);
     
        String str = bfn.readLine();
        int i=Integer.parseInt(bfn.readLine());
        System.out.println("Entered String: "+str);
        System.out.println("Entered Integer: "+i);
      }
}