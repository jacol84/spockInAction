package pl.jac.spock.blocks

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class AndLabel extends Specification {


    def 'should create item of give parameters'() {
        given:
        String name = 'Jacek'
        and:
        Role category = Role.USER
        and:
        String mail = "jacekt@tajne.pl"
        when:
        User user = new User(name, category, mail)
        then:
        user.getName() == name
        and:
        user.getCategory() == category
        and:
        user.getMail() == mail
    }

}
