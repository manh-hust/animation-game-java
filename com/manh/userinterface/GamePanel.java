import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel implements Runnable, KeyListener{
    
    private Thread thread;
    private boolean isRunning;
    private InputManage inputManage;

    public GamePanel(){
        inputManage = new InputManage();

     
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, GameFrame.SCREEN_WIDTH, GameFrame.SCREEN_HEIGHT);

    }

    public void startGame(){
        if(thread == null){
            isRunning = true;
            thread = new Thread(this);
            thread.start();
        }
    }
    @Override
    public void run(){
        long FPS = 80;
        long period = 1000 * 1000000/FPS;
        long beginTime ;
        long sleepTime;

        int a = 1;

        beginTime = System.nanoTime();

        while(true){
            // System.out.println(a++);
            // Update game
            // Render game
            long delta = System.nanoTime() - beginTime;
            sleepTime = period - delta;

            try {
                if(sleepTime > 0){
                    Thread.sleep(sleepTime/1000000);
                }else{
                    Thread.sleep(period/2000000);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
            beginTime = System.nanoTime();

        }
    }

    @Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void keyPressed(KeyEvent e){
       inputManage.processKeyPressed(e.getKeyCode());
    }
    @Override
    public void keyReleased(KeyEvent e){
        inputManage.processKeyReleased(e.getKeyCode());
    }

}
