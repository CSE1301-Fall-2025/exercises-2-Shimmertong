package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class E06MouseFollower {
    public static void main(String[] args) {

        StdDraw.enableDoubleBuffering();

        // 起始位置（点的当前位置）
        double px = 0.5;
        double py = 0.5;

        while (true) {
            StdDraw.clear();

            // 鼠标当前位置
            double mx = StdDraw.mouseX();
            double my = StdDraw.mouseY();

            // 让点只向鼠标靠近一点点（0.05 = 5% 的追随速度）
            px = px + 0.05 * (mx - px);
            py = py + 0.05 * (my - py);

            // 画点
            StdDraw.setPenColor(Color.RED);
            StdDraw.setPenRadius(0.02);
            StdDraw.point(px, py);

            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}
