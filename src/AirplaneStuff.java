public class AirplaneStuff {
    public int gate;
    public String airportName;
    public Boolean boarding;

    public AirplaneStuff() {//constructor
        gate = 250;
        airportName = "Jacob6";
        boarding = true;


    }
    public AirplaneStuff(int pGate,String pAirportname,Boolean pBoarding){
        gate=pGate;
        airportName=pAirportname;
        boarding=pBoarding;
    }
    public void terminalinfo(){
        System.out.println(gate);
        System.out.println(airportName);
        System.out.println(boarding);
    }
}