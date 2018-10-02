public class Animal {

    private String type;
    private String [] continents ;
    private float weight;
    private int age;

    public void setType(String type){
        this.type = type;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setContinents(String continents[]) {

        this.continents = new String[continents.length];
        for (int i = 0; i < continents.length; i++) {
            this.continents[i] = continents[i];
        }
    }

    public String[] getContinents() {
        return continents;
    }

    public String getType(){
        return type;
    }

    public float getWeight(){
        return weight;
    }

    public int getAge(){
        return age;
    }

    public Animal(){
        this.type = "No Type Specified   ";
        this.age = 0;
        this.weight = (float) 0.0;
        this.continents = continents ;

    }

    public Animal(String type,int age, float weight,String continents[]){
        setType(type);
        setAge(age);
        setWeight(weight);
        setContinents(continents);
    }

    public String toString(){
        String str="";

        if(continents[0] == null){
            return str;
        }
        for(String a : continents){
            str += a +"\n";

        }
        return ("Type :"+type+ "\nAge: "+age+ "\nWeight: "+weight+ "\nContinent: "+str);
    }

}
