public class Bicycle {

    private String name;
    private double value;
    private String make;

    public void setMake(String make) {
        this.make = make;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Name: "+name+"\nValue: "+value+"\nMake: "+make;
    }

    public Bicycle() {
        this.name = "None";
        this.value = 0;
        this.make = "None";
    }

    public Bicycle(String name,String make,double value){
        setName(name);
        setMake(make);
        setValue(value);
    }
}
