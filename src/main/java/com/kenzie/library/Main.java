package com.kenzie.library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This will only compile if the required interfaces and abstract classes are defined correctly");
    }
}

// CardSet DTO
class CardSetDTO {
    String cardHand;
}

// DealerService
class DealerService {
    void deal(int numCards) {
        String dealingCards = String.format("Dealing {%d} cards", numCards);
        System.out.println(dealingCards);
    }
}

class GamePlayer extends Player {
    double checkTotalCash() {
        double total = 0.00;
        System.out.println("checkTotal defined");
        return total;
    }

    void updateTotalCash(double total) {
        System.out.println("updateTotal defined");
    }
}

class GameCardHand extends CardHand {
}

class GameCard extends Card {
}

class Poker extends Game {
    public Poker(String name){
        this.name = name;
    }

    CardSetDTO requestDeal(int number) {
        System.out.println("requestDeal defined");
        CardSetDTO cardSet = new CardSetDTO();
        return cardSet;
    }

    boolean checkHand(CardHand hand) {
        System.out.println("checkHand defined");
        return true;
    }
}
