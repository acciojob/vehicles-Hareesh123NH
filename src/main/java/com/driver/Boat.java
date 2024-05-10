import com.driver.WaterVehicle;

public class Boat implements WaterVehicle{
    private String name;
    private int currentSpeed = 0;
    private int currentDirection = 0;
    private int capacity;
    public Boat(String name,int capacity){
        this.capacity=capacity;
        this.name=name;
    }
    public void move(int speed,int direction){
        this.currentDirection= direction;
        this.currentSpeed=speed;
    }
    public void steer(int direction){
        this.currentSpeed = this.currentDirection + direction;
    }
    public void stop(){
        this.currentSpeed = 0;
    }

    public String getVehicleName(){
        return name;
    }
    public int getVehicleCapacity(){
        return capacity;
    }
    
}
