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
public class CategoriesComponentModel {
    
    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values = "No resourceType")
    protected String resourceType;

    @ValueMapValue
    private String category;

    @ValueMapValue
    private String fileReference; // Need same name of XML fileReferenceParameter="./fileReference"

    @ValueMapValue
    private String allCategories; 

    public String getCategory() {
        return StringUtils.isNotBlank(this.category) ? this.category : "Category Empty";
    }

    public String getFileReference() {
        return fileReference;
    }

    public String getAllCategories() {
        return allCategories;
    }
}
