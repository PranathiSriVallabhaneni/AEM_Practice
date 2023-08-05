package com.adobe.aem.pranathi.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;


@Component(service = ServiceDemo.class, immediate = true) //factory=true
@Designate(ocd=ServiceDemoConfigurations.class)
public class ServiceDemoImpl implements ServiceDemo {

    ServiceDemoConfigurations serviceDemoConfigurations;

    @Activate
    private void activate(ServiceDemoConfigurations config)
    {
        serviceDemoConfigurations = config;
    }

    @Override
    public String getCourseName(){
        return serviceDemoConfigurations.courseName();
    }
    public String getCourseDuration(){
        return serviceDemoConfigurations.courseDuration();
    }
    public String getCourseContent(){
        return serviceDemoConfigurations.courseContent();
    }
}
