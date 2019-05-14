# sampleGradlePlugin
sample gradle plugin using a standalone plugin with gradle 5.3.1

I got this code from a stackoverflow answer:
    https://stackoverflow.com/questions/53196731/gradle-custom-plugin-jar-with-dependencies/
My objective was to build a standalone plugin that I could use
in a gradle project.  Thanks to @M.Ricciuti for his answer that got me here with a minor tweak
(adding the settings.gradle file).

Note I made this a multi-project build, but that has some drawbacks.  You need to run
```
    gradle publish
```
in the plugin directory before issuing any other gradle commands (or you will get gradle
errors because the plugin can't be loaded).  I did this because I wanted my real project
to be buildable within intellij idea, which does not otherwise see local maven repos.

To run this:
```
    cd plugin
    gradle publish
    cd ../proj
    gradle testPlugin
```
you should see:
    Result: Stringtotest
