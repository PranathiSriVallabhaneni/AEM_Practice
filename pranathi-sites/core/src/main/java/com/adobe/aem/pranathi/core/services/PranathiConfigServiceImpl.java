package com.adobe.aem.pranathi.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = PranathiConfigService.class, immediate = true)
@Designate(ocd = PranathiConfig.class)
public class PranathiConfigServiceImpl implements PranathiConfigService{
    PranathiConfig pConfig;

    @Activate
    public void init(PranathiConfig config)
    {
        pConfig = config;
    }
    @Override
    public String getCourseName() {
        return pConfig.courseName();
    }

    @Override
    public String getInstructor() {
        return pConfig.instructor();
    }

    @Override
    public String getDuration() {
        return pConfig.duration();
    }

    @Override
    public String getLocation() {
        return pConfig.location();
    }
}
