public class MyPointDriver {
    public static void main(String[] args) {

        MyPoint xy = new MyPoint();

        System.out.println(xy.toString());

        MyPoint ab = new MyPoint();
        ab.setxVal(0);
        ab.setyVal(0);

        ab.toString();

        ab.moveVertically(3);
        ab.moveHorizontally(3);
        System.out.println(ab.getxVal());
        System.out.println(ab.getxVal());

        
        System.out.print(ab.DistanceFromOrigin());



    }
}
