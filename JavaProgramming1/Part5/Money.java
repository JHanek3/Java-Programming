
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros == compared.euros && this.cents > compared.cents) {
            return false;
        } else {
            return true;
        }
    }

    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        } else {
            double e = this.euros;
            Double eD = Double.valueOf(e);
            float eF = eD.floatValue();
            double c = this.cents;
            Double cD = Double.valueOf(c);
            float cF = cD.floatValue();
            float start = eF + (cF /100);

            double dE = decreaser.euros;
            Double dED = Double.valueOf(dE);
            float dEF = dED.floatValue();
            double dC = decreaser.cents;
            Double dCD = Double.valueOf(dC);
            float dCF = dCD.floatValue();
            float minus = dEF + (dCF /100);

            // System.out.println(start);
            // System.out.println(minus);

            float sum = start - minus;
            System.out.println(sum);
            String[] arr=String.valueOf(sum).split("\\.");
            int[] intArr=new int[2];
            intArr[0]=Integer.parseInt(arr[0]);
            intArr[1]= Integer.parseInt(arr[1]) * 10; 
            
            
            return new Money(intArr[0], intArr[1]);
            
        }
    }


}
