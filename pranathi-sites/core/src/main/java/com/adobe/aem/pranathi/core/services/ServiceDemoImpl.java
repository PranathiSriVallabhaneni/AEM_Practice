package com.adobe.aem.pranathi.core.services;

import org.osgi.service.component.annotations.Component;

@Component(service = ServiceDemo.class, immediate = true)
public class ServiceDemoImpl implements ServiceDemo {

    @Override
    public String getCourseName(){
        return "AEM Training Course";
    }
    public String getCourseDuration(){
        return "1 Month";
    }
    public String getCourseContent(){
        return "Frontend and Backend";
    }
}
