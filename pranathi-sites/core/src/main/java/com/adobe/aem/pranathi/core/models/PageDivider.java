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
public class PageDivider {
    
    @ValueMapValue
    private String text;

    @ValueMapValue
    private Image image;

    @OSGiService
    private ModelFactory modelFactory;

    @Self
    private SlingHttpServletRequest request;

    public String getName() {
        return text;
    }

    public Image getImage() {
        return image;
    }


    @PostConstruct
    private void init() {
        image = modelFactory.getModelFromWrappedRequest(request,
                                                        request.getResource(),
                                                        Image.class);
    }
    
}
