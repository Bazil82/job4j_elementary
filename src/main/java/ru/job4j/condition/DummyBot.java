package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "This baffles me. Ask another question.";
        if ("Hello bot".equals(question)) {
            rsl = "Hey smart guy.";
        } else if ("Bye".equals(question)) {
            rsl = "See you soon.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hello bot");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye");
        System.out.println(rsl);
        rsl = DummyBot.answer("I have nothing to say");
        System.out.println(rsl);
    }
}
