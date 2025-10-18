package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class E04WaitPoint {

    /*
     * Exercise: Use the StdDraw API to complete the code one
     * step at a time.
     */
    public static void main(String[] args) {
        // 显示提示（可选）
        StdDraw.text(0.5, 0.95, "Click somewhere to place a point; then press 'q' to finish.");

        // wait for the mouse to be pressed
        while (!StdDraw.mousePressed()) {
            StdDraw.pause(20); // 减少 CPU 占用
        }

        // here, the mouse has been pressed

        // wait for the mouse to be released
        while (StdDraw.mousePressed()) {
            StdDraw.pause(20);
        }

        // here the mouse is released
        // draw a point at the location of the mouse
        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();
        StdDraw.setPenRadius(0.02);       // 让点大一点好看
        StdDraw.setPenColor(Color.RED);
        StdDraw.point(x, y);
        StdDraw.setPenRadius();          // 恢复默认线宽

        // here, wait until a 'q' (or 'Q') has been typed
        while (true) {
            if (StdDraw.hasNextKeyTyped()) {
                char c = StdDraw.nextKeyTyped();
                if (c == 'q' || c == 'Q') {
                    break;
                }
            }
            StdDraw.pause(20);
        }

        // 按下 q 后显示 farewell
        StdDraw.text(0.5, 0.5, "Farewell!");
    }
}
