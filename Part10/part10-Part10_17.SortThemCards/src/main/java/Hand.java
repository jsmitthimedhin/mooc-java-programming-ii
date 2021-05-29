
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class Hand implements Comparable<Hand> {
    private List<Card> cardsInHand = new ArrayList<>();
    
    public Hand() {
        
    }
    
    public void add(Card card) {
        cardsInHand.add(card);
    }
    
    public void print() {
        cardsInHand.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cardsInHand, (card1, card2) -> card1.compareTo(card2));
        
    }
    
    public void sortBySuit() {
        Collections.sort(cardsInHand, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
       int sum = 0;
       for(Card testSubject: cardsInHand) {
           sum = sum + testSubject.getValue();
       }
       int sum2 = 0;
       for(Card testSubject: hand.cardsInHand) {
           sum2 = sum2 + testSubject.getValue();
       }
       return sum - sum2;
    }
    
//    Method to be used instead of compareTo if the cards have similar values but have different suits.
    public int compareSuit(Hand hand) {
        int sum =0;
        for(Card testSubject: cardsInHand) {
            sum = sum + testSubject.getSuit().ordinal();
        }
        int sum2 = 0;
        for(Card testSubject: hand.cardsInHand) {
            sum2 = sum2 + testSubject.getSuit().ordinal();
        }
        return sum - sum2;
    }
    
    
    public int compare(Card arg0, Card arg1) {
        return 1;
    }
    
    
}
