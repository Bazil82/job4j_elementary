package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hello bot";
        String res = DummyBot.answer(in);
        String exp = "Hey smart guy.";
        Assert.assertEquals(exp, res);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye";
        String res = DummyBot.answer(in);
        String exp = "See you soon.";
        Assert.assertEquals(exp, res);
    }

    @Test
    public void whenUnknownBot() {
        String in = "I have nothing to say";
        String res = DummyBot.answer(in);
        String exp = "This baffles me. Ask another question.";
        Assert.assertEquals(exp, res);
    }
}