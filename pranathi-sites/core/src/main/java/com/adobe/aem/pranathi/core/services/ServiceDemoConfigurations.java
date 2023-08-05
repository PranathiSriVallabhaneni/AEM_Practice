package com.adobe.aem.pranathi.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="Service Demo Example")
public @interface ServiceDemoConfigurations {

    @AttributeDefinition
    String courseName() default "AEM Training Course";

    @AttributeDefinition
    String courseDuration() default "2 Months";

    @AttributeDefinition
    String courseContent() default "Frontend and Backend";
}
