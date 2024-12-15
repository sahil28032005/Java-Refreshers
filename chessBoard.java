import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class chessBoard{

    public static void main(String arg[]) {
        JFrame jf = new JFrame();
        jf.setBounds(10, 10, 512, 512);
        JPanel jp = new JPanel() {

            public void paint(Graphics g) {
                for (int i = 0; i < 7; i++) {

                    for (int j = 0; j < 8; j++) {
                        if ((i + j) % 2 == 0) {
                            g.setColor(Color.white);
                        } else {
                            g.setColor(Color.black);
                        }
                         Thread t=new Thread(){
                            public void run(){

                                try{Thread.sleep(1000);
                                g.fillRect(i * 64, j * 64, 64, 64);}
                                 catch(Exception e){
                            e.printStackTrace();
                        }
                                
                             
                            };};
                             
                            
                       
                        
                       
                       
                       
                    }
                }
            }
        };
        jf.add(jp);
        jf.setVisible(true);
    }
}