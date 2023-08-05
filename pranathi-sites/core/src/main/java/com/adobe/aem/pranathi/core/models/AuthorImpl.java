package com.adobe.aem.pranathi.core.models;
import com.adobe.cq.wcm.core.components.models.Page;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;

import javax.inject.Inject;

@Model(adaptables=SlingHttpServletRequest.class, adapters=AuthorInt.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorImpl implements AuthorInt{
    @ScriptVariable
    Page currPage;

    @Inject
    @Required
    String firstName;

    @Inject
    @Required
    @Default(values="Vallabhaneni")
    String lastName;

    @Inject
    boolean isProfessor;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean getIsProffessor() {
        return isProfessor;
    }

    @Override
    public String getPageTitle() {
        return currPage.getTitle();
    }
}