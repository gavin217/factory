public class Airplane {
    ///  instance variables
    /// used in whole class
    /// they should be at the top of the class
    /// need public in front of them
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;


    public Airplane(){//constructor
        capacity=250;
        name="Jacob6";
        model="boeing 737";
        isDoubleDecker=false;
        length=157;

    }
    public Airplane(int pCapacity){
        capacity= pCapacity;
        name="Jacob6";
        model="boeing 737";
        isDoubleDecker=false;
        length=157;

    }
    //todo make a method called printinfo that prints the airplanes instance variables
    public void Printinfo(){
        System.out.println(capacity);
        System.out.println(model);
        System.out.println(name);
        System.out.println(length);
        System.out.println(isDoubleDecker);
    }
}
