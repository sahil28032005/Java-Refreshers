abstract class GameStation{
    abstract void start(String GameName);
     void play(){
        System.out.println("Game will start soon..");
    }
}
class Super{
    //here we have overriden method from object class which by default prints an hash code so we have changed implementation of that
    public String toString() {
        return "hello";
    }
    Super(){
        System.out.println("super constructor");
    }
    public void run(){
        System.out.println("running state...");
    }
}
class anotherClass extends GameStation{
    String gameName="MineCraft";
    public void start(String g){
        this.gameName=g;
    }
    public void play(){
        System.out.println("i am currently playing "+this.gameName);
    }
}
class Sub extends Super{
    Sub(){
        new Super();
        System.out.println("sub constructor");
        
    }
    public void stop(){
        System.out.println("stopped working");
    }
}
 class practice{
    public static void main(String ar[]){
    Sub s=new Sub();
    Sub k=new Sub(){
      public void stop(){
        Super s=new Super();
        s.run();
      }
    };
    s.stop();
System.out.println(k);
System.out.println(s.equals(k));
    anotherClass ac=new anotherClass();
    ac.start("grand theft auto");
    ac.play();//here we have achieved abstraction by using abstarct methods
    
    }
}