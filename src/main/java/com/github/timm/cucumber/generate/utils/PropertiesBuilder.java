package com.github.timm.cucumber.generate.utils;

import java.util.Properties;

public class PropertiesBuilder {
    private final Properties properties = new Properties();


    public Properties build() {
        return properties;
    }


    /**
     * Sets the default used for this plug-in
     * @return properties with resource.loader and class.resource.loader.class set
     */
    public PropertiesBuilder withDefaults() {
        properties.put("resource.loader", "class");
        properties.put("class.resource.loader.class",
                       "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        return this;
    }


    public PropertiesBuilder with(String key, String value) {
        properties.setProperty(key, value);
        return this;
    }
}
