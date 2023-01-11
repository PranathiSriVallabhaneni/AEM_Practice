package com.adobe.aem.pranathi.core.models;

import java.util.Objects;

import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.commons.Externalizer;

@Model(adaptables=Resource.class)
public class LinkModel {

    @ValueMapValue
    private String label;
    @ValueMapValue
    private String linkPath;
    @ValueMapValue
    private String target;
    @ValueMapValue
    private Boolean external;

    @SlingObject
    private ResourceResolver resourceResolver;

    @OSGiService
    private Externalizer externalizer;

    @PostConstruct
    protected void init(){
        if(Objects.nonNull(resourceResolver) && Objects.nonNull(external))
        {
            linkPath = externalizer.authorLink(resourceResolver, linkPath);
        }
    }

    public String getLabel() {
        return label;
    }
    public String getLinkPath() {
        return linkPath;
    }
    public String getTarget() {
        return target;
    }
    public Boolean getExternal() {
        return external;
    }
    
}
