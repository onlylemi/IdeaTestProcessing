import com.onlylemi.processing.IProcessing;
import com.onlylemi.processing.Processing;

/**
 * P5App
 *
 * @author onlylemi
 * @time 2016/12/24 10:11
 */
public class P5App extends Processing implements IProcessing{

    Particle particle;

    public void setting() {
        size(720, 500);
    }

    public void setup() {
        background(255);

        particle = new Particle();
    }

    public void draw() {
        stroke(255, 0, 0);
        strokeWeight(10);
        fill(0, 255, 0);

        ellipse(200, 200, 100, 100);

        particle.draw();
    }
}
