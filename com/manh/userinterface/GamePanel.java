import javax.imageio.ImageIO;
import java.awt.image.BufferedIamge;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.awt.Color;
import java.awt.Graphics;
import com.manh.effect.FrameImage;

public class GamePanel extends JPanel implements Runnable, KeyListener{
    
    private Thread thread;
    private boolean isRunning;
    private InputManage inputManage;

    FrameImage frame1;

    public GamePanel(){
        inputManage = new InputManage();

        try {
            BufferImage image  = ImageIO.read(new File("data/megasprite.png"));
            BufferedImage image1 = image.getSubimage(529, 38, 70, 100);
            frame1 = new FrameImage("frame1", image1);
        } catch (Exception e) {
            //TODO: handle exception
        }
     
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, GameFrame.SCREEN_WIDTH, GameFrame.SCREEN_HEIGHT);

        Graphics2D g2 = (Graphics2D) g;

        frame1.draw(g2, 30, 30);

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
