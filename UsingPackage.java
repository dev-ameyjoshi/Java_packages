import com.amey.AmeyC;

class Using extends AmeyC{
       void meth1(){
                //System.out.println(a);//private variable hence not accesible.in the same package.
                System.out.println(y);
                System.out.println(x);
               // System.out.println(z); 
        }
}

public class UsingPackage {
    public static void main(String[] args) {
        System.out.println("I am using packages");
        Using bro = new Using();
        bro.meth1();
        
    }
}