package nl.mvdr.annotationprocessingtest.morecode;

import nl.mvdr.annotationprocessingtest.annotation.ExampleAnnotation;

/**
 * Sample class carryng an annotation to be processed.
 * 
 * @author Martijn van de Rijdt
 */
@ExampleAnnotation
public class YetAnotherAnnotatedClass {
    /** Dummy method. */
    public void hello() {
        System.out.println("Hello!");
    }
}
