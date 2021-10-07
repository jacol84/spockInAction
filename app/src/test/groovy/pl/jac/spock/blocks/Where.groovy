package pl.jac.spock.blocks

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification
import spock.lang.Unroll

class Where extends Specification {

    def 'should create item of give parameters'() {
        when:
        User user = new User(name, role, mail)
        then:
        user.getName() == name
        and:
        user.getRole() == role
        and:
        user.getMail() == mail
        where:
        role   | name    | mail
        Role.ADMIN | "jacek" | "jac@mik.pl"
        Role.ADMIN | "jacek" | null
        Role.USER  | "jacek" | "jac@mik.pl"
    }

    @Unroll("with Unroll - should create User(#name, #role, #mail) of give parameters")
    def 'should create item of give parameters2'() {
        when:
        User user = new User(name, role, mail)
        then:
        user.getName() == name
        and:
        user.getRole() == role
        and:
        user.getMail() == mail
        where:
        role   | name    | mail
        Role.ADMIN | "jacek" | "jac@mik.pl"
        Role.ADMIN | "jacek" | null
        Role.USER  | "jacek" | "jac@mik.pl"
    }

    def 'without Unroll - should create User(#name, #role, #mail) of give parameters'() {
        when:
        User user = new User(name, role, mail)
        then:
        user.getName() == name
        and:
        user.getRole() == role
        and:
        user.getMail() == mail
        where:
        role   | name    | mail
        Role.ADMIN | "jacek" | "jac@mik.pl"
        Role.ADMIN | "jacek" | null
        Role.USER  | "jacek" | "jac@mik.pl"
    }

    def 'use iterationIndex - should create User[#iterationIndex] of give parameters'() {
        when:
        User user = new User(name, role, mail)
        then:
        user.getName() == name
        and:
        user.getRole() == role
        and:
        user.getMail() == mail
        where:
        role   | name    | mail
        Role.ADMIN | "jacek" | "jac@mik.pl"
        Role.ADMIN | "jacek" | null
        Role.USER  | "jacek" | "jac@mik.pl"
    }

}
