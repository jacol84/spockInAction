package pl.jac.spock.groovy

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class MapGroovy extends Specification {
    def 'should create empty map'() {
        when:
        def map = [:]
        then:
        map.size() == 0
        map.isEmpty()
    }

    def 'should create  simple map map'() {
        when:
        def map = ["key": 100L]
        then:
        map.size() == 1
        map["key"] == 100L
    }

    def 'should create advanced map map'() {
        when:
        def map = ["key": 100L, otherMap: ["id": new User("ja", Role.ADMIN, "ja@mail.com")]]
        then:
        map.size() == 2
        map["key"] == 100L
        map["otherMap"]["id"].name == "ja"
    }

}
