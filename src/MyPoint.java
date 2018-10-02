public class MyPoint {

    private int xVal;
    private int yVal;

    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    public void setyVal(int yVal) {
        this.yVal = yVal;
    }

    public int getxVal() {
        return xVal;
    }

    public int getyVal() {
        return yVal;
    }

    public String toString(){
        return "X position is : "+xVal + "\n Y position is : "+yVal;
    }

    public MyPoint(){
        setxVal(xVal);
        setyVal(yVal);
    }

    public MyPoint(int xVal, int yVal){
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public void moveHorizontally(int moveH){
        this.xVal += moveH;
    }

    public void moveVertically(int moveV){
        this.yVal += moveV;
    }

    public void translate(int moveH, int moveV){
        moveHorizontally(moveH);
        moveVertically(moveV);

    }

    public double DistanceFromOrigin(){
        //double xy2 = (xVal * xVal)*(yVal * yVal);

        double ans = Math.sqrt(((xVal * xVal)+(yVal * yVal)));


        return ans;
    }




}