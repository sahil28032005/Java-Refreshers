class ParendClass{
    ParendClass(){
        System.out.println("in parent constructor");
    }
    protected void config(){
        System.out.println("in configuraton mode..");
    }
}

class ChildClass extends ParendClass{
   ChildClass(){
    System.out.println("in child constructor");
   }
    public void listConfiguration(){
        System.out.println("My configurtions are... \n windows 10 home with nvidia gtx1650 graphics card");
    }
}


 class UpCasting{
    public static void main(String arg[]){
      
      ParendClass p=new ChildClass();//here we are doing actually upcast ParentClass p=(ParentClass) new ChildClass(); this is happening actually here
      p.config();
    //   p.listConfiguration();this will not work due to upcasting
    // ParendClass p1=(ChildClass) new ChildClass();
    // p1.listConfiguration();

    }
}