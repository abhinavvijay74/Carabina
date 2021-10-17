
package carabina;

public class table {
     synchronized void printable(int j)
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(i*j);
        }
    }
   synchronized void print(String a)
   {
       for(int j=1;j<11;j++)
       {
       System.out.println(a);
       }
   }
   
}
