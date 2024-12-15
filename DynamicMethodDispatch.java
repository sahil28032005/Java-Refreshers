class j{
    public void send(){
        System.out.println("sending...");
    }
}
class k extends j{
    public void seek(){
        System.out.println("in seek meth..");
    }
    public void send(){
        System.out.println("in child send");
    }
}

public class DynamicMethodDispatch{

    public static void main(String arg[]){
       k obj=new j();
       obj.send();
    }
}