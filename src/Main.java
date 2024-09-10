import javax.swing.*;

public static void main() {
    JFrame frame = new JFrame("Mandelbrot");
    Mandelbrot mandelbrot = new Mandelbrot();
    frame.add(mandelbrot);
    frame.setSize(1400, 1200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
