package com.adobe.aem.guides.foodland.core.models;
import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;


import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeroComponentModel {
    
    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values = "No resourceType")
    protected String resourceType;

    
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String image2Reference;

    @ValueMapValue
    private String imageHero;

    @ValueMapValue
    private boolean isHotRecipe = false;

    @ValueMapValue
    private String autor;

    @ValueMapValue
    private LocalDate date = LocalDate.now();

    @ValueMapValue
    private String linkRecipe;

    @ValueMapValue
    private String ingredient;

    @ValueMapValue
    private int time;

    //private String message;

    public String getImageHero() {
        return imageHero;
    }

    public String getIngredient() {
        return StringUtils.isNotBlank(this.ingredient) ? this.ingredient : "Ingredient is empty";
    }

    public int getTime() {
        return time; 
    }

    public String getTitle() {
        return StringUtils.isNotBlank(this.title) ? this.title : "Title is empty";
    }

    public String getText() {
        return StringUtils.isNotBlank(this.text) ? this.text : "Text is empty";
    }

    public String getImage2Reference() {
        return image2Reference;
    }

    public boolean isHotRecipe() {
        return isHotRecipe;
    }

    public String getAutor() {
        return StringUtils.isNotBlank(this.autor) ? this.autor : "Autor is empty";
    }

   public LocalDate getDate() {
        return date;
    }

    public String getLinkRecipe() {
        return StringUtils.isNotBlank(this.linkRecipe) ? this.linkRecipe : "URL is empty";
    }

    

  /*public String getMessage() {
        return getTitle() + "\n"+
        getText() + "\n" + 
        getAutor()+ "\n" +
        getDate();
    }
   */  

    




}
