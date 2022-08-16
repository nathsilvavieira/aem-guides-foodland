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
public class RecipesComponentModel {

    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values = "No resourceType")
    protected String resourceType;

    @ValueMapValue
    private String recipeTitle;

    @ValueMapValue
    private int time;

    @ValueMapValue
    private String recipeType;

    @ValueMapValue
    private String  fileReference;

    @ValueMapValue
    private boolean isLike;

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public int getTime() {
        return time;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public String getFileReference() {
        return fileReference;
    }

    public boolean isLike() {
        return isLike;
    }


    


}
