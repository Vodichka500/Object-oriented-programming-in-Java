import java.util.Random;
public class Okrag {
    int x;
    int y;
    int r;

    Okrag()
    {
        Random rd = new Random();
        x = rd.nextInt(91)+5;
        y = rd.nextInt(91)+5;
        r = rd.nextInt(5)+1;
    }
}
