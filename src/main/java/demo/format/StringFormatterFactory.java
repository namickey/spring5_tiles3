package demo.format;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

public class StringFormatterFactory implements AnnotationFormatterFactory<StringFormat> {

    @Override
    public Set<Class<?>> getFieldTypes() {
        System.out.println("getFieldTypes");
        return new HashSet<Class<?>>(Arrays.asList(String.class));
    }

    @Override
    public Printer<?> getPrinter(StringFormat annotation, Class<?> fieldType) {
        System.out.println("getPrinter");
        return new StringFormatter();
    }

    @Override
    public Parser<?> getParser(StringFormat annotation, Class<?> fieldType) {
        System.out.println("getParser");
        return new StringFormatter();
    }

}
