import sun.util.resources.cldr.mas.CalendarData_mas_KE;

public abstract class Car {

    public Car() {}

    // Abstract method (does not have a body)
    public abstract void CarSound();
    // Regular method
    public void sleep() {
        System.out.println("Brum Brum ...");
    }

    private String _Model;
    private String _Brand;
    private String _Fuel;
    private String _HP;
    private String _Tourqe;

    public void setModel(String in) {
        _Model = in;
    }
    public void setBrand(String in) {
        _Brand = in;
    }
    public void setFuel(String in) {
        _Fuel = in;
    }
    public void setHP(String in) {
        _HP = in;
    }
    public void setTourqe(String in) {
        _Tourqe = in;
    }

    public String getModel() {
        return _Model;
    }
    public String getBrand() {
        return _Brand;
    }
    public String getFuel() {
        return _Fuel;
    }
    public String getHP() {
        return _HP;
    }
    public String getTourqe() {
        return _Tourqe;
    }

}
