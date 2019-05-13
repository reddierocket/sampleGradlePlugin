package org.gradle.sample.plugin

import org.apache.commons.lang3.StringUtils
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {
    @Override
    void apply(final Project project) {
        println "Applying custom plugin... "
        project.tasks.create('testPlugin'){
            doLast{
                println " custom plugin task executing."
                println "Result: " + StringUtils.capitalize("stringtotest")
            }
        }
    }
}
