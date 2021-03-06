/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.spring.tests.generate;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("ultimate/testData/spring/core/generate")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class GenerateSpringDependencyActionTestGenerated extends AbstractGenerateSpringDependencyActionTest {
    public void testAllFilesPresentInGenerate() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("ultimate/testData/spring/core/generate"), Pattern.compile("^([\\w]+)\\.kt$"), TargetBackend.ANY);
    }

    @TestMetadata("autowiredDependencies/duplicatingPropertyAnnotationConfig.kt")
    public void testAutowiredDependencies_DuplicatingPropertyAnnotationConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/duplicatingPropertyAnnotationConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("autowiredDependencies/duplicatingPropertyXmlConfig.kt")
    public void testAutowiredDependencies_DuplicatingPropertyXmlConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/duplicatingPropertyXmlConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("autowiredDependencies/multiplePropertiesAnnotationConfig.kt")
    public void testAutowiredDependencies_MultiplePropertiesAnnotationConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/multiplePropertiesAnnotationConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("autowiredDependencies/multiplePropertiesXmlConfig.kt")
    public void testAutowiredDependencies_MultiplePropertiesXmlConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/multiplePropertiesXmlConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("autowiredDependencies/propertyWithQualifierAnnotationConfig.kt")
    public void testAutowiredDependencies_PropertyWithQualifierAnnotationConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/propertyWithQualifierAnnotationConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("autowiredDependencies/propertyWithQualifierXmlConfig.kt")
    public void testAutowiredDependencies_PropertyWithQualifierXmlConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/propertyWithQualifierXmlConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("autowiredDependencies/singlePropertyAnnotationConfig.kt")
    public void testAutowiredDependencies_SinglePropertyAnnotationConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/singlePropertyAnnotationConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("autowiredDependencies/singlePropertyXmlConfig.kt")
    public void testAutowiredDependencies_SinglePropertyXmlConfig() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/autowiredDependencies/singlePropertyXmlConfig.kt");
        doTest(fileName);
    }

    @TestMetadata("beanDependenciesByXml/firstConstructor.kt")
    public void testBeanDependenciesByXml_FirstConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/beanDependenciesByXml/firstConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("beanDependenciesByXml/primaryConstructorAddParam.kt")
    public void testBeanDependenciesByXml_PrimaryConstructorAddParam() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/beanDependenciesByXml/primaryConstructorAddParam.kt");
        doTest(fileName);
    }

    @TestMetadata("beanDependenciesByXml/property.kt")
    public void testBeanDependenciesByXml_Property() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/beanDependenciesByXml/property.kt");
        doTest(fileName);
    }

    @TestMetadata("beanDependenciesByXml/secondaryConstructorAddParam.kt")
    public void testBeanDependenciesByXml_SecondaryConstructorAddParam() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/beanDependenciesByXml/secondaryConstructorAddParam.kt");
        doTest(fileName);
    }

    @TestMetadata("beanDependenciesByXml/setter.kt")
    public void testBeanDependenciesByXml_Setter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/generate/beanDependenciesByXml/setter.kt");
        doTest(fileName);
    }
}
