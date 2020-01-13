package com.metro.test.v1;

// factory interface for CardSwipeIn and CardSwipeOut implementation classes.
public interface CardSwipeFactory {
	void processCard() throws MetroCardProcessException;
}
