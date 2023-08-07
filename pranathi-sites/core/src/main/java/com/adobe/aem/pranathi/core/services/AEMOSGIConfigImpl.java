package com.adobe.aem.pranathi.core.services;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = AEMOSGIConfigService.class, immediate = true)
@Designate(ocd = AEMOSGIConfig.class)
public class AEMOSGIConfigImpl implements AEMOSGIConfigService{

    AEMOSGIConfig aemOsgiConfig;
    String name;
    String id;

    @Activate
    public void init(AEMOSGIConfig config){
       name = config.osgiServiceName();
       id = config.osgiServiceId();
    }


    @Override
    public String getOsgiName(){
        return name;
    }

    @Override
    public String getOsgiId() {
        return id;
    }


}
