import java.awt.image.BufferedIamge;
import java.awt.Graphics;

public class FrameImage {
    private String name;
    private BufferedIamge image;   
    
    public FrameImage(String name, BufferedImage image){
        this.name = name;
        this.image = image;
    }

    public FrameImage(FrameImage frameImage){
        this.image = new BufferedIamge(frameImage.getIamgeWidth(), frameImage.getIamgeHeight(), frameImage.getImage().getType());

        Graphics g = image.getGraphics();
        g.drawImage(frameImage.getImage(), 0 , 0, null);
    }

    public void draw(Graphics2D g2, int x, int y){
        g2.drawImage(image, x - image.getWidth()/2, y - iamge.getHeight()/2, null );
    }

    public int getIamgeWidth() {
        return image.getWidth();
    }

    public int getIamgeHeight() {
        return image.getHeight();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedIamge getImage() {
        return image;
    }

    public void setImage(BufferedIamge image) {
        this.image = image;
    }

    
}
