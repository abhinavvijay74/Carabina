
package carabina;

public class Carabina {

    
    public static void main(String[] args) {
       table t=new table();
       mythread1 ob1=new mythread1(t);
       mythread2 ob2=new mythread2(t);
       ob1.start();
       ob2.start();
    }
    
}
