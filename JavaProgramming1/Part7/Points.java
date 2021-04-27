import java.util.*;

public class Points {
    private ArrayList<Integer> pointsList;
    
    public Points() {
        this.pointsList = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getPointsList() {
        return this.pointsList;
    }

    public void addPoints(int point) {
        this.pointsList.add(point);
    }

    public String getAverage() {
        int sum = 0;
        for (int point: pointsList) {
            sum += point;
        }
        return String.format("Point average (all): %.1f", 1.0 * sum / pointsList.size());
    }

    public String getPassingAverage() {
        int sum = 0;
        int count = 0;
        for (int point: pointsList) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        if (count == 0) {
            return "Point average (passing): -";
        }
        return String.format("Point average (passing): %.1f", 1.0 * sum / count);
    }

    public String getPassPercentage() {
        int passers = 0;
        for (int point: pointsList) {
            if (point >= 50) {
                passers++;
            }
        }
        return "Pass percentage: " + Double.toString(100 * passers / pointsList.size());
    }

    public void getGradeDistribution() {
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
        int zero = 0;
        for (int point: pointsList) {
            if (point >= 90) {
                five++;
            } else if (point >= 80) {
                four++;
            } else if (point >= 70) {
                three++;
            } else if (point >= 60) {
                two++;
            } else if (point >= 50) {
                one++;
            } else {
                zero++;
            }
        }
        
        System.out.println(String.format("5: %s", String.join("", Collections.nCopies(five, "*"))));
        System.out.println(String.format("4: %s", String.join("", Collections.nCopies(four, "*"))));
        System.out.println(String.format("3: %s", String.join("", Collections.nCopies(three, "*"))));
        System.out.println(String.format("2: %s", String.join("", Collections.nCopies(two, "*"))));
        System.out.println(String.format("1: %s", String.join("", Collections.nCopies(one, "*"))));
        System.out.println(String.format("0: %s", String.join("", Collections.nCopies(zero, "*"))));
    }
}
