package com.adobe.aem.pranathi.core.services;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="Pranathi Course OSGI Configuration")
public @interface PranathiConfig {

    @AttributeDefinition
    String courseName() default "AEM Course";

    @AttributeDefinition
    String instructor() default  "Pranathi";

    @AttributeDefinition
    String duration() default "2 Months";

    @AttributeDefinition
    String location() default "Bangalore";
}
