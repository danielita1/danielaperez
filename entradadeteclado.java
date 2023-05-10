import java.io.*;
import java .util.*;
public class entradadeteclado
{
   public static void main (String[] args)   {
   int n;
   Scanner in = new Scanner (System.in);
   n = in. nextInt();
   System.out.println("El numero ingresado es:"+n);
   String text="";
   text =in.nextLine();
   System.out.println(" El texto ingresado es : "+ text);
}
}
