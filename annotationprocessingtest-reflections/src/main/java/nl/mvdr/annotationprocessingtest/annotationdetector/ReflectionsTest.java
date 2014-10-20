package nl.mvdr.annotationprocessingtest.annotationdetector;

import java.util.Set;

import nl.mvdr.annotationprocessingtest.annotation.ExampleAnnotation;

import org.reflections.Reflections;

/**
 * Test class for the reflections framework.
 * 
 * @author Martijn van de Rijdt
 */
public class ReflectionsTest {
    /**
     * Main method; detects and prints all occurrences of {@link ExampleAnnotation}.
     * 
     * @param args command line parameters; these are ignored
     */
    public static void main(String[] args) {
        Reflections reflections = new Reflections();
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(ExampleAnnotation.class);
        classes.forEach(System.out::println);
    }
}
