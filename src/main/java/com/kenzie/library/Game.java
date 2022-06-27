package com.kenzie.library;
/*
        Define abstract classes here:
        The __Player__ must be implemented with these attributes and operations:
        1) `totalCash` for dollar amount the player possesses as double
        2) `checkTotalCash()` method returns double: Check available dollar amount by taking in no arguments and returning dollar amount as double
        3) `updateTotalCash(double total)` method returns void: Update available dollar amount by taking in dollar amount as a double.

        A __CardHand__ must be implemented to hold the cards returned from `DealerService` with these attributes:
        1) `numCards` for number of cards as int
        2) `cardArray` as array of `Card` values

        A __Card__ class must be implemented to track the value of one card with these attributes:
        1) `value` as char value ('A','2','3','4','5','6','7','8','9','10','J','Q','K')
        2) `suit` as String value (i.e. heart, diamond, club, spade)

        Each __Game__ is required to be implemented with these attributes and operations:

        1) `name` of the game as string
        2) `numCards per hand` for number of cards per hand as int
        3) `betAmount` for amount of bet as double
        4) `requestDeal(int number)` method returns a `CardSetDTO` object
        5) `checkHand(CardHand hand)` method which returns boolean value
*/
