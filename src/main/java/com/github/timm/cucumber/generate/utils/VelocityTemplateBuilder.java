package com.github.timm.cucumber.generate.utils;

import org.apache.velocity.Template;
import org.apache.velocity.app.VelocityEngine;

import java.util.Properties;

public class VelocityTemplateBuilder {
    private VelocityTemplateBuilder() {

    }


    /**
     * Create a Velocity Template.
     * @param properties
     * @param template
     * @param encoding
     * @return new Velocity Template
     */
    public static Template build(Properties properties, String template, String encoding) {
        final VelocityEngine engine = new VelocityEngine(properties);
        engine.init();
        return engine.getTemplate(template, encoding);
    }
}
