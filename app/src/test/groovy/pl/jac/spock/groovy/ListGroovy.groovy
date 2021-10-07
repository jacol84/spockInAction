package pl.jac.spock.groovy

import spock.lang.Specification

class ListGroovy extends Specification {
    def 'should create empty map'() {
        when:
        def list = []
        then:
        list.size() == 0
        list.isEmpty()
    }

    def 'should create map'() {
        when:
        def list = ["list"]
        then:
        list.size() == 1
        list[0] == "list"
    }

}
