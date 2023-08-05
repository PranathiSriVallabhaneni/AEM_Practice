package com.adobe.aem.pranathi.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.factory.ModelFactory;

import com.adobe.cq.wcm.core.components.models.Image;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class}, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class BilineModel {
    
    @ValueMapValue
    private String name;

    @ValueMapValue
    private String jobTitle;

    @ValueMapValue
    private Image personPicture;

    @OSGiService  //@inject
    private ModelFactory modelFactory;

    @Self
    private SlingHttpServletRequest request;

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Image getPersonPicture() {
        return personPicture;
    }


    @PostConstruct
    private void init() {
        personPicture = modelFactory.getModelFromWrappedRequest(request,
                                                        request.getResource(),
                                                        Image.class);
    }
    
}
