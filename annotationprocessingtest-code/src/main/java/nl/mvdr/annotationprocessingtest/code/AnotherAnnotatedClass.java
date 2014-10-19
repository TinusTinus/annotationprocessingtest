package nl.mvdr.annotationprocessingtest.code;

import nl.mvdr.annotationprocessingtest.annotation.ExampleAnnotation;

/**
 * Sample class carryng an annotation to be processed.
 * 
 * @author Martijn van de Rijdt
 */
@ExampleAnnotation
public class AnotherAnnotatedClass {
    /** Dummy method. */
    public void hello() {
        System.out.println("Hello!");
    }
}
