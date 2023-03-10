public class AutomaticVehicles extends Vehicle {
    private int engine;//двигателя

    public AutomaticVehicles(String modelName, int wheelsCount, int engine) {
        super(modelName, wheelsCount);
        this.engine = engine;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
public void getRepair(){
    System.out.println("У транспортного средства имеется " +getEngine());

};
}
