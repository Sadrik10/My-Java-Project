package day29interfacemanipulations;

public abstract class ElectricalVehicles implements AirCondition {
    /*
    Abstract class can have abstract methods and non-abstract methods
    so we can override and implement
    super class or interface methods in abstract class
    but this cannot be achieved in Interface
     */
    @Override
    public void electronicAc(){
        System.out.println("Electrical vehicle AC..");
    }
    @Override
    public void bacteriaKiller(){
        System.out.println("Electrical vehicle bacteriakillers.. ");
    }
}
