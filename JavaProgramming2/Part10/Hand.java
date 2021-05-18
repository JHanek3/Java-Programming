package Part10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
            .comparing(Card::getValue)
            .thenComparing(Card::getSuit);
        Collections.sort(hand, comparator);
    }

    public void sortBySuit() {
        BySuitInValueOrder bySuitInValueOrder = new BySuitInValueOrder();
        Collections.sort(hand, bySuitInValueOrder);
    }

    private int sumOfValues() {
        int sum = 0;

        for (Card card: hand) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sumOfValues() - hand.sumOfValues();
    }
}
