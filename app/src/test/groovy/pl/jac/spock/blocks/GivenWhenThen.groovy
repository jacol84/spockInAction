package pl.jac.spock.blocks

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class GivenWhenThen extends Specification {


    def 'should create item of give parameters'() {
        given:
        String name = 'Jacek'
        Role role = Role.USER
        String mail = "jacekt@tajne.pl"
        when:
        User user = new User(name, role, mail)
        then:
        user.getName() == name
        user.getRole() == role
        user.getMail() == mail
    }

    def 'should create item with def of give parameters'() {
        given:
        def name = 'Jacek'
        def role = Role.USER
        def mail = "jacekt@tajne.pl"
        when:
        def user = new User(name, role, mail)
        then:
        user.getName() == name
        user.getRole() == role
        user.getMail() == mail
    }

}
