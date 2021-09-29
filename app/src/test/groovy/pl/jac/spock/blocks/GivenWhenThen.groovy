package pl.jac.spock.blocks

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class GivenWhenThen extends Specification {


    def 'should create item of give parameters'() {
        given:
        String name = 'Jacek'
        Role category = Role.USER
        String mail = "jacekt@tajne.pl"
        when:
        User user = new User(name, category, mail)
        then:
        user.getName() == name
        user.getCategory() == category
        user.getMail() == mail
    }

}
