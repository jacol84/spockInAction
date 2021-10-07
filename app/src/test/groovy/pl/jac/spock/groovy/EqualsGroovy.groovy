package pl.jac.spock.groovy

import spock.lang.Specification

class EqualsGroovy extends Specification {
    def '== is alias Equals'() {
        setup:
        def myLong1 = 1000L
        def myLong2 = new Long(1000L)
        expect:
        myLong1 == myLong2
        myLong1.equals(myLong2)
    }

    def '=== is the same as Java =='() {
        setup:
        def myLong1 = 1000L
        def myLong2 = new Long(1000L)
        expect: "it is same == in java"
        !(myLong1 === myLong2)
    }

    def 'should compare person with equals'() {
        setup:
        def myLong1 = 1000L
        def myLong2 = new Long(1000L)
        expect:
        myLong1 == myLong2
        myLong1.equals(myLong2)
    }
}
