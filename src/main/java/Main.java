import com.lucaspowered.base_physics_simulation.*;
import com.lucaspowered.base_physics_simulation.shapes.Circle;
import com.lucaspowered.base_physics_simulation.Vector2;
import static com.raylib.Jaylib.*;
import static java.lang.Math.sin;

public class Main {
    public static void main(String[] args) {
        World myWorld = new World("Hello Circle" /* Name */, RAYWHITE /* Color */,
                        new Integer[] {400, 400} /* Resolution LxH */, 60 /* Target FPS*/);

        Circle myCircle = new Circle(BLACK, 25, new Vector2(myWorld.getHeight() / 2,
                myWorld.getWidth() / 2));

        myCircle.equation((Number t) -> {return new Vector2(myWorld.getWidth() / 2,
                sin(t.doubleValue()) * 100 + myWorld.getHeight() / 2);});

        myWorld.add(myCircle);

        myWorld.run();
    }
}