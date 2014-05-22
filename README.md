Is it possible to use the classes from a grails binary plugin as a regular dependency in a groovy/griffon project?

After many different approaches the answer seems to be NO, but I feel like there is just a missing little piece dealing with dependencies.

In this attempt we are following the advice from Graeme Rocher in this answer from Stackoverflow ([http://stackoverflow.com/questions/23805439/using-grails-plugin-classes-in-a-groovy-project/23807207?noredirect=1#23807207](Using grails plugin classes in a groovy project?))

Using:
-----------
   * sample-gradle-grails: Manual groovy project with some 'magic' to act as a grails plugin
   * sample-groovy(groovy 2.2.1) : Groovy project that justs prints 'Hi' and regular dependency on 'sample-gradle-grails-1.0-SNAPSHOT.jar'

Problems:
-----------
...let's see...