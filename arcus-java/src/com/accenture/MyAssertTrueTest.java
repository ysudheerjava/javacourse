package com.accenture;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Optional;
 
public class MyAssertTrueTest {
 
	/*
	 * public boolean isEvenNumber(int number){
	 * 
	 * boolean result = false; if(number%2 == 0){ result = true; } return result; }
	 * 
	 * 
	 * @Test public void evenNumberTest(){ MyAssertTrueTest asft = new
	 * MyAssertTrueTest(); assertTrue(asft.isEvenNumber(3)); }
	 * 
	 * 
	 * 
	 * @Test public void givenNonNull_whenCreatesNonNullable_thenCorrect() { String
	 * name = "baeldung"; Optional<String> opt = Optional.of(name);
	 * assertTrue(opt.isPresent()); }
	 * 
	 * 
	 * 
	 * 
	 * @Test public void givenNull_whenCreatesNullable_thenCorrect() { String name =
	 * null; Optional<String> opt = Optional.ofNullable(name);
	 * assertFalse(opt.isPresent()); }
	 */
	 
    
    @Test
    public void givenOptional_whenIsPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("Baeldung");
        assertTrue(opt.isPresent());

        opt = Optional.ofNullable(null);
        assertFalse(opt.isPresent());
    }
    
    
    
}