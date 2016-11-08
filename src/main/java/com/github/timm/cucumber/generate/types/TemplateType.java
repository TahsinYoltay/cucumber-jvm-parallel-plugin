package com.github.timm.cucumber.generate.types;

public enum TemplateType {
    TESTNG("cucumber-testng-runner.vm"),
    JUNIT("cucumber-junit-runner.vm"),
    CUSTOM("cucumber-custom-runner.vm");
    private final String template;


    TemplateType(final String template) {
        this.template = template;
    }


    public String getTemplate() {
        return template;
    }

}
