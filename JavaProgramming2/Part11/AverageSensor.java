

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public void setOn() {
        for (Sensor sensor: sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor: sensors) {
            sensor.setOff();
        }
    }

    public boolean isOn() {
        for (Sensor sensor: sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    public int read() {
        int value = 0;
        int size = this.sensors.size();
        if (isOn() == true) {
            for (Sensor sensor: sensors) {
                value += sensor.read();
            }
            this.readings.add(value/size);
            return value / size;
        } else {
            throw new IllegalStateException("Average Sensor is off or no sensors have been added");
        }

    }

    public List<Integer> readings() {
        return this.readings;

    }

    
}
