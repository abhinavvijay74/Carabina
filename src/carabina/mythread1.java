
package carabina;


public class mythread1 extends Thread {
    table t;

    public mythread1(table t) {
        this.t=t;
        
    }
    
    
    public void run()
    {
        t.printable(10);
        t.print("abhinav");
    }
    
    
    
}
