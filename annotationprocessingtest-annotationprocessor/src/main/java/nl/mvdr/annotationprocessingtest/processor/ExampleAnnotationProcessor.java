package nl.mvdr.annotationprocessingtest.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

/**
 * Annotation processor.
 * 
 * @author Martijn van de Rijdt
 */
@SupportedAnnotationTypes({ "nl.mvdr.annotationprocessingtest.annotation.ExampleAnnotation" })
@SupportedOptions({ "testOption" })
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ExampleAnnotationProcessor extends AbstractProcessor {
    /** {@inheritDoc} */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!annotations.isEmpty()) {
            // print option values
            System.out.println("Options: " + processingEnv.getOptions());
            System.out.println("");
            
            // print all classes carrying our annotation 
            System.out.println("Annotated classes:");
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
