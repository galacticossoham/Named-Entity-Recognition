
import java.io.*;
import java.lang.*;
import java.util.*;
public class SS
{
 public static void main(String args[])
 {
    String str; String s=null;String a=null,b=null,c=null,d=null,e=null,f=null,g=null,h=null,i=null;int j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0;
    try
        {
            BufferedReader in = new BufferedReader(new FileReader("output.txt"));
  
            while((str = in.readLine())!=null)
            {
                StringTokenizer st = new StringTokenizer(str,")");
                while(st.hasMoreTokens())
                {
                    
                    s=st.nextToken();
                    System.out.println("The TOKEN :"+s);
                    if((s.startsWith(" (NN ")))
                    {
                        j=s.length();
                        a=s.substring(5,j);
                        System.out.println("The common noun : "+a);
                    }
                    else if(s.startsWith(" (NP (NNP "))
                    {
                        m=s.length();
                        d=s.substring(10,m);
                        System.out.println("The proper noun : "+d);
                    }
                    else if(s.startsWith("      (NP (NNP "))
                    {
                        n=s.length();
                        e=s.substring(15,n);
                        System.out.println("The proper noun : "+e);
                    }
                    else if(s.startsWith("    (NP (NNP "))
                    {
                        o=s.length();
                        f=s.substring(13,o);
                        System.out.println("The proper noun : "+f);
                    }
                    else if(s.startsWith("        (NP (NNP "))
                    {
                        p=s.length();
                        g=s.substring(17,p);
                        System.out.println("The proper noun : "+g);
                    }
                    else if(s.startsWith("          (NP (NNP "))
                    {
                        k=s.length();
                        b=s.substring(19,k);
                        System.out.println("The proper noun : "+b);
                    }
                    else if(s.startsWith(" (NNP "))
                    {
                        l=s.length();
                        c=s.substring(6,l);
                        System.out.println("The proper noun : "+c);
                    }
                    else if(s.startsWith(" (NNS "))
                    {
                        q=s.length();
                        h=s.substring(6,q);
                        System.out.println("The common noun : "+h);
                    }
                    else if(s.startsWith("                  (NP (NNS "))
                    {
                        r=s.length();
                        i=s.substring(27,r);
                        System.out.println("The common noun : "+i);
                    }
                    
       
                }
       
            }
  
        }
 
    catch(IOException ee)
    {
        System.out.println(ee);
    }
 }   
    
}