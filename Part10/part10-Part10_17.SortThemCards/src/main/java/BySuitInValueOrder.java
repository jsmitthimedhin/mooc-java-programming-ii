
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        int bySuit = card1.getSuit().ordinal() - card2.getSuit().ordinal();
        if(bySuit==0) {
            int byValue = card1.getValue() - card2.getValue();
            return byValue;
        }
        return bySuit;
    }
    
}
