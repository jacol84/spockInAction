package pl.jac.spock.blocks

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class Where extends Specification {


    def 'should create item of give parameters'() {
        when:
        User user = new User(name, category, mail)
        then:
        user.getName() == name
        and:
        user.getCategory() == category
        and:
        user.getMail() == mail
        where:
        category   | name    | mail
        Role.ADMIN | "jacek" | "jac@tt.pl"
        Role.ADMIN | "jacek" | null
        Role.USER  | "jacek" | "jac@tt.pl"
    }

}
