package drawingtools;

public class Result {
    void drawCurve(DrawingTool tool, Curve curve) {
        System.out.println("Drawing a curve " +
                curve + " using a " + tool);
        tool.draw(curve);
    }
}
