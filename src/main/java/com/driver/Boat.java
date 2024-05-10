import com.driver.*;

public class Boat implements WaterVehicle{
    private String name;
    //private int currentSpeed = 0;
    //private int currentDirection = 0;
    private int capacity;
    public Boat(String name,int capacity){
        this.capacity=capacity;
        this.name=name;
    }
    /*public void move(int speed,int direction){
        this.currentDirection= direction;
        this.currentSpeed=speed;
    }
    public void steer(int direction){
        this.currentSpeed = this.currentDirection + direction;
    }
    public void stop(){
        this.currentSpeed = 0;
    }*/
    public void setVehicleName(String name) {
        this.name = name;
    }

    public void setVehicleCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVehicleName(){
        return this.name;
    }
    public int getVehicleCapacity(){
        return this.capacity;
    }
    
}
