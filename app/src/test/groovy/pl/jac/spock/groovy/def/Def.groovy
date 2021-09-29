package pl.jac.spock.groovy.def

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class Def extends Specification {
    def 'should create item of give parameters'() {
        given:
        def name = 'Jacek'
        def category = Role.USER
        def mail = "jacekt@tajne.pl"
        when:
        def user = new User(name, category, mail)
        then:
        user.getName() == name
        user.getCategory() == category
        user.getMail() == mail
    }
}
