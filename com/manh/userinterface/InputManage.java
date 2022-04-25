import java.awt.event.KeyEvent;

public class InputManage {
    
    public void  processKeyPressed(int keyCode){
        switch(keyCode){
            case  KeyEvent.VK_UP:
                System.out.println("You pressed UP");
                
                break;
            case  KeyEvent.VK_DOWN:
                System.out.println("You pressed DOWN");
            
            break;
            case  KeyEvent.VK_LEFT:
                System.out.println("You pressed LEFT");
            
            break;
            case  KeyEvent.VK_RIGHT:
                System.out.println("You pressed RIGHT");
            
            break;
            case  KeyEvent.VK_ENTER:
                System.out.println("You pressed ENTER");
                
            break;
            case  KeyEvent.VK_SPACE:
                System.out.println("You pressed SPACE");
                
            break;
            case  KeyEvent.VK_A:
                System.out.println("You pressed A");
                
            break;


        }
    }
    public void  processKeyReleased(int keyCode){
        switch(keyCode){
            case  KeyEvent.VK_UP:
                System.out.println("You released UP");
                
                break;
            case  KeyEvent.VK_DOWN:
                System.out.println("You released DOWN");
            
            break;
            case  KeyEvent.VK_LEFT:
                System.out.println("You released LEFT");
            
            break;
            case  KeyEvent.VK_RIGHT:
                System.out.println("You released RIGHT");
            
            break;
            case  KeyEvent.VK_ENTER:
                System.out.println("You released ENTER");
                
            break;
            case  KeyEvent.VK_SPACE:
                System.out.println("You released SPACE");
                
            break;
            case  KeyEvent.VK_A:
                System.out.println("You released A");
                
            break;


        }
    }
}
