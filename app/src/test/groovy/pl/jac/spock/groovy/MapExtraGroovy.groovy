package pl.jac.spock.groovy

import pl.jac.spock.person.Address
import pl.jac.spock.person.Person
import spock.lang.Specification

class MapExtraGroovy extends Specification {
    def 'should create simple object'() {
        when:
        def person = [firstName: "Jacek", lastName: "name", address: [country: "POL", address: "Poznan 58"] as Address] as Person
        then:
        person.firstName == "Jacek"
        person.lastName == "name"
        person.address.country == "POL"
        person.address.address == "Poznan 58"
    }

    def 'should create simple object use dummy'() {
        given:
        def dummy = [firstName: "Jacek", lastName: "name", address: [country: "POL", address: "Poznan 58"]]
        when:
        def person = dummy as Person
        then:
        person.firstName == "Jacek"
        person.lastName == "name"
        person.address.country == "POL"
        person.address.address == "Poznan 58"
    }

    def 'should create simple object use leftShift'() {
        given:
        def map = [firstName: "Jacek", lastName: "name", address: [country: "POL", address: "Poznan 58"]]
        when:
        def person = (map << [firstName: "Karol"]) as Person
        then:
        person.firstName == "Karol"
        person.lastName == "name"
        person.address.country == "POL"
        person.address.address == "Poznan 58"
    }

    def 'should create simple object use creator'() {
        when:
        def person = createPerson(firstName: "Karol")
        then:
        person.firstName == "Karol"
        person.lastName == "name"
        person.address.country == "POL"
        person.address.address == "Poznan 58"
    }

    private Person createPerson(def with) {
        return (getPersonDefMap() << with ?: [:]) as Person
    }

    private LinkedHashMap<String, Serializable> getPersonDefMap() {
        [firstName: "Jacek", lastName: "name", address: [country: "POL", address: "Poznan 58"]]
    }

}
