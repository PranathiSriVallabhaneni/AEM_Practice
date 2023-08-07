package com.adobe.aem.pranathi.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "OSGI Configuration Service")
public @interface AEMOSGIConfig {

    @AttributeDefinition
    String osgiServiceName() default "Pranathi OSGI Config Name";

    @AttributeDefinition
    String osgiServiceId() default "Pranathi OSGI Config Id";
}
