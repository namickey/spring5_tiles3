package demo.format;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class StringFormatter implements Formatter<String> {

    @Override
    public String print(String object, Locale locale) {
        System.out.println("print:" + object);
        return object;
    }

    @Override
    public String parse(String text, Locale locale) throws ParseException {
        System.out.println("parse:" + text);
        return text;
    }

}
