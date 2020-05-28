package ObjectOutputStream;

import java.io.Serializable;

public class VehicleInfo implements Serializable {
    int numberOfWheels;
    int mileage;
    String nameOfVehicle;
    VehicleInfo(int numberOfWheels, int mileage, String nameOfVehicle){
        this.numberOfWheels = numberOfWheels;
        this.mileage = mileage;
        this.nameOfVehicle = nameOfVehicle;
    }
}
