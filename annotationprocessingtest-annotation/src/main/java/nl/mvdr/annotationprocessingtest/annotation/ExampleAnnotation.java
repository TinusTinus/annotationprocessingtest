package nl.mvdr.annotationprocessingtest.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotation to be processed.
 * 
 * @author Martijn van de Rijdt
 */
@Target(ElementType.TYPE)
public @interface ExampleAnnotation {

}
