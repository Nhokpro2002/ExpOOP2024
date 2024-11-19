package hus.oop.lab6;

public class Line {

    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return begin + "," + end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        begin.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        // calculus length of vector AB in Oxy
        int coordinatesVertical = getEndX() - getBeginX();
        int coordinatesHorizontal = getEndY() - getBeginY();
        return Math.sqrt(coordinatesVertical * coordinatesVertical + coordinatesHorizontal * coordinatesHorizontal);
    }

    public double getGradient() {
        double coordinatesVertical = getEndX() - getBeginX();
        double coordinatesHorizontal = getEndY() - getBeginY();
        return Math.atan2(coordinatesHorizontal, coordinatesVertical);

    }

}
