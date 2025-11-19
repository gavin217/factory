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
        Airplane plane3=new Airplane(232,"jacob",true,157,"Boeing 737");
        System.out.println(plane3.capacity);
        plane3.Printinfo();
        AirplaneStuff terminal1=new AirplaneStuff();
        terminal1.terminalinfo();
        //type varname=value
        //object of the type airplane




    }

    public void factoryInfo(){

        System.out.println("founded in "+ yearFounded);
        System.out.println(factoryName);
        System.out.println("it is "+isOpen +" that the factory is open");

    }
}
