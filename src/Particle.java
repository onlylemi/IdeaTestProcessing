import com.onlylemi.processing.Processing;

/**
 * Particle
 *
 * @author onlylemi
 * @time 2016/12/24 13:42
 */
public class Particle extends Processing {

    public void draw() {
        fill(0, 0, 255);
        stroke(0);
        strokeWeight(15);

        ellipse(400, 400, 100, 100);
    }
}
