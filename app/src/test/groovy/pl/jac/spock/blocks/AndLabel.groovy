package pl.jac.spock.blocks

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class AndLabel extends Specification {


    def 'should create item of give parameters'() {
        given:
        def name = 'Jacek'
        and:
        def role = Role.USER
        and:
        def mail = "jacekt@tajne.pl"
        when:
        def user = new User(name, role, mail)
        then:
        user.getName() == name
        and:
        user.getRole() == role
        and:
        user.getMail() == mail
    }

}
