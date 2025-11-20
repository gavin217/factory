public class AirplaneStuff {
    public int gate;
    public String terminal;
    public Boolean boarding;

    public AirplaneStuff() {//constructor
        gate = 2;
        terminal = "a";
        boarding = false;


    }
    public AirplaneStuff(int pGate,String pTerminal,Boolean pBoarding){
        gate=pGate;
        terminal=pTerminal;
        boarding=pBoarding;
    }
    public void airportinfo(){
        System.out.println(gate);
        System.out.println(terminal);
        System.out.println(boarding);
    }
}