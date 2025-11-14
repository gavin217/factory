public class Factory {
    int yearFounded=1798;
    public String factoryName = "airplane factory";
    public boolean isOpen=true;

    public static void main(String[] args) {
        System.out.println("welcome to Gavin's factory");
        new Factory();
    }

    //constructor
    //is a method
    //has same name as the class
    //public but no void
    public Factory(){
        isOpen=false;
        String manager="Mr Hales";
        System.out.println(manager);
        //factoryInfo();
        yearFounded=1800;
        factoryInfo();
        //type varname=value
        //object of the type airplane
        Airplane plane1=new Airplane();
        plane1.name="jeff";
        System.out.println(plane1.name);
        plane1.capacity=360;
        plane1.model="airbus";
        plane1.isDoubleDecker=true;
        plane1.length=70;
        System.out.println("the plane can fit "+plane1.capacity+" people");
        System.out.println("it is an "+plane1.model);
        System.out.println("it is "+plane1.isDoubleDecker+" that the plane has a double decker");
        System.out.println("it is "+plane1.length+" m long");
        Airplane plane2=new Airplane();
        System.out.println(plane2.capacity);
        System.out.println(plane2.name);
        System.out.println(plane2.model);
        System.out.println(plane2.isDoubleDecker);
        System.out.println(plane2.length);
        Airplane plane3=new Airplane();
        plane1.name="jeff";
        System.out.println(plane1.name);
        plane1.capacity=360;
        plane1.model="airbus";
        plane1.isDoubleDecker=true;
        plane1.length=70;
        System.out.println(plane3.capacity);
        System.out.println(plane3.name);
        System.out.println(plane3.model);
        System.out.println(plane3.isDoubleDecker);
        System.out.println(plane3.length);
        //todo make 2 more airplane objects
        //todo for one change all instane variables
        //todo for both print all instance variables


    }

    public void factoryInfo(){

        System.out.println("founded in "+ yearFounded);
        System.out.println(factoryName);
        System.out.println("it is "+isOpen +" that the factory is open");

    }
}
