package com.adobe.aem.guides.foodland.core.models;

import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;
import org.apache.commons.lang3.StringUtils;
import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponentModel {
    
    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values = "No resourceType")
    protected String resourceType;

    @ValueMapValue
    private String  facebookReference;

    @ValueMapValue
    private String  twitterReference;

    @ValueMapValue
    private String  instagramReference;

    @ValueMapValue
    private String  linkFacebook;

    @ValueMapValue
    private String  linkTwitter;

    @ValueMapValue
    private String  linkInstagram;

    @ValueMapValue
    private String  fileReference;

    public String getFacebookReference() {
        return facebookReference;
    }



    public String getTwitterReference() {
        return twitterReference;
    }



    public String getInstagramReference() {
        return instagramReference;
    }



    public String getLinkFacebook() {
        return linkFacebook;
    }



    public String getLinkTwitter() {
        return linkTwitter;
    }



    public String getLinkInstagram() {
        return linkInstagram;
    }

    public String getFileReference() {
        return fileReference;
    }



}
