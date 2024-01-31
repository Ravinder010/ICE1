/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modifier : Ravinder Singh
 * Student ID : 991715910
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i]=c;
            System.out.println(c.getSuit()+"\t"+c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card value (1-13) : ");
        int enterValue = scanner.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3= Spades) : ");
        int enterSuitValue = scanner.nextInt();
        
        boolean found = false;
        for(int i=0; i<magicHand.length; i++){
            Card c = magicHand[i];
            if (c.getValue()== enterValue && c.getSuit().equals(Card.SUITS[enterSuitValue])){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Great! Your card is in the magic hand");
        }
        else{
            System.out.println("Sorry, Your card is not in the magic hand");
        }
        
        //Then report the result here
        // add one luckcard hard code 2,clubs
        
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Spades");

        boolean found = fasle;
        for(Card card : magicHand){
            if(Card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckycard.getSuit())){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Congratulation! The lucky card is in the magic hand");
        } else{
            System.out.println("Sorry, The lucky card is not in the magic hand");
        }
        
    }
    
}
