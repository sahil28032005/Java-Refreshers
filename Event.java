import java.awt.event.ActionListener;
import java.awt.Button;


public class Event implements ActionListener{
    
    public void actionPerformed(ActionEvent a){
      System.out.println("event has been started");
    }
    public static void main(String aarg[]){
      Button b=new Button("click me");
      b.setVisible(true);
      b.setSize(200,200);
    }
}