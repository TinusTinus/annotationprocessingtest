package nl.mvdr.annotationprocessingtest.annotationdetector;

import java.io.IOException;

import eu.infomas.annotation.AnnotationDetector;
import nl.mvdr.annotationprocessingtest.annotation.ExampleAnnotation;

/**
 * Test class for the annotation-detector framework.
 * 
 * @author Martijn van de Rijdt
 */
public class AnnotationDetectorTest {
    /**
     * Main method; detects and prints all occurrences of {@link ExampleAnnotation}.
     * 
     * @param args command line parameters; these are ignored
     */
    public static void main(String[] args) {
        ExampleTypeReporter reporter = new ExampleTypeReporter();
        AnnotationDetector detector = new AnnotationDetector(reporter);
        try {
            detector.detect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
