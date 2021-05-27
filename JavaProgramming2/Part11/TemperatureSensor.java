

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean on;
    private int value;

    public TemperatureSensor() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn() {
        this.on = true;
    }

    public void setOff() {
        this.on = false;
    }

    public int read() {
        if (this.on == true) {
            this.value = new Random().nextInt(61) - 30;
            return this.value;
        } else {
            throw new IllegalStateException("Sensor is off");
        }
    }


}
