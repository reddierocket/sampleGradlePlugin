# sampleGradlePlugin
sample gradle plugin using a standalone plugin with gradle 5.3.1

I got this code from a stackoverflow answer:
    https://stackoverflow.com/questions/53196731/gradle-custom-plugin-jar-with-dependencies/
My objective was to build a standalone plugin that I could use
in a gradle project.  Thanks to @M.Ricciuti for his answer that got me here with a minor tweak.

To run this:
    cd plugin
    gradle publish
    cd ../proj
    gradle testPlugin

    you should see:
        Result: Stringtotest
