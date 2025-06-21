public class Vehicle {
    private String color;
    public Vehicle(String color) {
        this.color = color;
    }
    public Vehicle() {
        //this.color = "red";
        this("green");
    }

    public String getColor() {
        return color;
    }
}
