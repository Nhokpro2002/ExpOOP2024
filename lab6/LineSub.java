package hus.oop.lab6;

public class LineSub extends Point {

    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public String toString() {
        return "Line[Point(" + getX() + "," + getY() + ")"  + ", " + end;
    }

    public Point getBegin() {
        //Point beginPoint = new Point(getX(), getY());
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setX(begin.getX());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        setX(beginX);
    }

    public void setBeginY(int beginY) {
        setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        setXY(beginX, beginY);
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



