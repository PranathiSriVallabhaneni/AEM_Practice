package com.adobe.aem.pranathi.core.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class}, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class SlingModelExampleModel{

    @ValueMapValue
    private String mainLabel;

    @ValueMapValue(name="sling:resourceType")
    private String resourseType;

    @ChildResource
    private List<LinkModel> links = new ArrayList<>();

    public String getResourseType() {
        return resourseType;
    }

    public String getMainLabel() {
        return mainLabel;
    }

    public List<LinkModel> getLinks() {
        return links;
    }
}