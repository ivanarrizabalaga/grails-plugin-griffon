Is it possible to use the classes from a grails binary plugin as a regular dependency in a groovy project?

After many different approaches the answer seems to be NO, but I feel like there is just a missing little piece dealing with dependencies.

Using:
-----------
   * sample-grails(grails 2.3.7) : Binary grails plugin with one dummy domain
   * sample-groovy(groovy 2.2.1) : Groovy project that justs prints 'Hi' and regular dependency on 'sample-grails-1.0-SNAPSHOT.jar'

Problems:
-----------
If you dont add anything it does not compile:

*NoClassDefFoundError: org/grails/datastore/mapping/dirty/checking/DirtyCheckable.*

Add dependency "org.grails:grails-datastore-gorm-hibernate4:3.0.0.RELEASE"

*NoClassDefFoundError: Lorg/codehaus/groovy/grails/plugins/web/api/ControllersDomainBindingApi;*

Add dependency "org.grails:grails-plugin-controllers:2.3.7"

*Compiles ok*

In runtime crashes:

*Exception in thread "main" java.lang.NoClassDefFoundError: javax/servlet/ServletResponse at org.codehaus.groovy.grails.plugins.web.api.ControllersDomainBindingApi.getDomainClass(ControllersDomainBindingApi.java:97) at org.codehaus.groovy.grails.plugins.web.api.ControllersDomainBindingApi.initialize(ControllersDomainBindingApi.java:58) at com.nortia.sample.Other.(Other.groovy)*