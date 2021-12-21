package edu.fiuba.algo3.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

public class ModelDependenciesTest {
	private final String MODEL = "..modelo..";
	private final String JAVA_LANG = "java..";
	private final String JUNIT = "org.junit..";

	@Test
	public void elModeloSoloPuedeReferenciarClasesDelModeloAdemasJavaAdemasJunit() {
		JavaClasses importedClasses = new ClassFileImporter().importPackages("edu.fiuba.algo3.modelo");

		String[] listOfPackages = {MODEL, JAVA_LANG, JUNIT};

		ArchRule myRule = classes().that().resideInAPackage(MODEL).should().onlyDependOnClassesThat()
				.resideInAnyPackage(listOfPackages);

		myRule.check(importedClasses);
	}

}
