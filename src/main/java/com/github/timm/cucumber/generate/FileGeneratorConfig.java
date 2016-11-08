package com.github.timm.cucumber.generate;

import com.github.timm.cucumber.generate.types.TemplateType;
import org.apache.maven.plugin.logging.Log;

import java.io.File;

public interface FileGeneratorConfig {

    boolean filterFeaturesByTags();

    Log getLog();

    File getFeaturesDirectory();

    String getEncoding();

    String getCucumberOutputDir();

    boolean useTestNG();

    TemplateType templateType();

    String getNamingScheme();

    String getNamingPattern();
}
