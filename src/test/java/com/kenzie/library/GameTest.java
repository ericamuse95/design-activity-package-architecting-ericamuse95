package com.kenzie.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
	public static GameCard getCard() {
		GameCard card = new GameCard();
		return card;
	}

	public static GameCardHand getCardHand() {
		GameCardHand hand = new GameCardHand();
		return hand;
	}

	public static Poker getGame() {
		Poker pokerGame = new Poker("Poker");
		return pokerGame;
	}

	public static GamePlayer getPlayer() {
		GamePlayer player = new GamePlayer();
		return player;
	}


	@Test
	void canCreateGameCard() {
        GameCard card = getCard();
		assertTrue(card instanceof Card, "GameCard is instance of Card" );
		assertEquals('\u0000', card.value, "Attribute value has not been created");
		assertNull(card.suit);
	}

	@Test
	void canCreateGameCardHand() {
		GameCardHand cardHand = getCardHand();
		assertTrue(cardHand instanceof CardHand, "GameCardHand is instance of CardHand" );
		assertEquals(0, cardHand.numCards, "Attribute numCards has not been created");
	}

	@Test
	void canCreateGamePlayer() {
		GamePlayer player = getPlayer();
		assertTrue(player instanceof Player, "GamePlayer is instance of Player" );
		assertEquals(0.0, player.totalCash, "Attribute totalCash has not been created");
	}

	@Test
	void canCreatePoker() {
		Poker game = getGame();
		assertTrue(game instanceof Game, "Poker is instance of Game" );
		assertEquals(0.0, game.betAmount, "Attribute betAmount has not been created");
		assertEquals(0, game.numberOfCardsPerHand, "Attribute numberOfCardsPerHand has not been created");
		assertEquals("Poker", game.name, "Attribute name has not been created");
	}
}
