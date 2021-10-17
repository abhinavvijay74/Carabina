
package carabina;


public class mythread2 extends Thread
{    
    table t;

    public mythread2(table t) {
        this.t=t;
        
    }
    
    public void run()
    {
        t.printable(11);
        t.print("shivam");
    }
}
