package nl.mvdr.annotationprocessingtest.annotationdetector;

import java.lang.annotation.Annotation;

import nl.mvdr.annotationprocessingtest.annotation.ExampleAnnotation;
import eu.infomas.annotation.AnnotationDetector.TypeReporter;

/**
 * Type reporter, which prints all types annotated with {@link ExampleAnnotation}.
 * 
 * @author Martijn van de Rijdt
 */
public class ExampleTypeReporter implements TypeReporter {
    /** {@inheritDoc} */
    @Override
    @SuppressWarnings("unchecked")
    public Class<? extends Annotation>[] annotations() {
        return new Class[] { ExampleAnnotation.class };
    }

    /** {@inheritDoc} */
    @Override
    public void reportTypeAnnotation(Class<? extends Annotation> annotation, String className) {
        System.out.println("Annotation found on class: " + className);
    }
}
