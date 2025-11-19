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
    public Airplane(int pCapacity, String pName, Boolean pIsDoubleDecker, int pLength,String pModel){
        capacity= pCapacity;
        name=pName;
        model=pModel;
        isDoubleDecker=pIsDoubleDecker;
        length=pLength;

    }

    public void Printinfo(){
        System.out.println(capacity);//not readable
        System.out.println("model "+ model);//simple readable
        System.out.println("this plane is named "+name);//fancy readable
        System.out.println("this plane is "+length+" feet");//fanciest readable
        System.out.println(isDoubleDecker);
    }
}
