package pl.jac.spock.groovy

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class UseDefGroovy extends Specification {
    def 'should create item of give parameters'() {
        given:
        def name = 'Jacek'
        and:
        def category = Role.USER
        and:
        def mail = "jacekt@tajne.pl"
        when:
        def user = new User(name, category, mail)
        then:
        user.getName() == name
        and:
        user.getRole() == category
        and:
        user.getMail() == mail
    }

}
