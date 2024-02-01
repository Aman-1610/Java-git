import java.io.*;
class ConsoleInput
{
public static void main(String args[])
{
String str;
char ch[];
Console obj=System.console();
System.out.print("ENter the username: ");
str = obj.readLine();
System.out.print("Enter the password: ");
ch=obj.readPassword();

System.out.println("Username: "+str);
System.out.println("Password: "+ch);
//converting char array into string
String a=String.valueOf(ch);
System.out.println("Password: "+a);
}
}