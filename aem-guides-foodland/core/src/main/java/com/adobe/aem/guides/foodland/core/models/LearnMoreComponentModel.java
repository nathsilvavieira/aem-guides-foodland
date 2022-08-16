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
public class LearnMoreComponentModel {
    
    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values = "No resourceType")
    protected String resourceType;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String imageReferecne; // Need same name of XML fileReferenceParameter="./fileReference"

    public String getTitle() {
        return StringUtils.isNotBlank(this.title) ? this.title : "Tittle Empty";
    }

    public String getText() {
        return StringUtils.isNotBlank(this.text) ? this.text : "Text Empty";
    }

    public String getImageReferecne() {
        return imageReferecne;
    }

    


}
