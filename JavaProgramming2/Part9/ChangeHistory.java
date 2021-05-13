package Part9;
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.size() == 0) {
            return 0.0;        
        } else {
            return Collections.max(history);
        }
    }

    public double minValue() {
        if (history.size() == 0) {
            return 0.0;
        } else {
            return Collections.min(history);
        }
    }

    public double average() {
        if (history.size() == 0) {
            return 0.0;
        } else {
            double sum = 0.0;
            int count = 0;
            for (double number: history) {
                sum += number;
                count++;
            }
            return sum / count;
        }
    }
}
