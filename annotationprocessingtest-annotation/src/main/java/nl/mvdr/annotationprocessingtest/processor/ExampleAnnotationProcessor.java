package nl.mvdr.annotationprocessingtest.processor;

import java.util.Collections;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import nl.mvdr.annotationprocessingtest.annotation.ExampleAnnotation;

/**
 * Annotation processor.
 * 
 * @author Martijn van de Rijdt
 */
public class ExampleAnnotationProcessor extends AbstractProcessor {
    /** {@inheritDoc} */
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        String name = ExampleAnnotation.class.getName();
        return Collections.singleton(name);
    }

    /** {@inheritDoc} */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!annotations.isEmpty()) {
            // print and process all classes carrying our annotation
            System.out.println("");
            System.out.println("Annotated classes: ");
            System.out.println("");

            annotations.stream()
                .map(roundEnv::getElementsAnnotatedWith)
                .flatMap(Set::stream)
                .forEach(System.out::println);
            
            System.out.println("");
        }

        return true;
    }
}
