/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'arrizabalaga' at '5/22/14 10:48 AM' with Gradle 1.11
 *
 * @author arrizabalaga, @date 5/22/14 10:48 AM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
