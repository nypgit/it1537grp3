package jday.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SMSSenderTest {

	@Test
	public void testSendMessage() {
		SMSSender sender = new SMSSender();
		sender.sendMessage("Hello this is me");
	}

}
