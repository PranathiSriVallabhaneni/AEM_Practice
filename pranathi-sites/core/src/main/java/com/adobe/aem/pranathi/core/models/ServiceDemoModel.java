package com.adobe.aem.pranathi.core.models;

import com.adobe.aem.pranathi.core.services.ServiceDemo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class}, defaultInjectionStrategy= DefaultInjectionStrategy.OPTIONAL)
public class ServiceDemoModel {

    @ValueMapValue
    private String myTitle;

    @OSGiService
    private ServiceDemo serviceDemo;

    public String getMyTitle() {
        return myTitle;
    }

    public ServiceDemo getServiceDemo() {
        return serviceDemo;
    }
}
