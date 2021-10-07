package pl.jac.spock.blocks

import pl.jac.spock.user.Role
import pl.jac.spock.user.User
import spock.lang.Specification

class SetupAndCleanup extends Specification {


    def 'should create item of give parameters'() {
        setup: // setup is alias 'given'
        println "setup"
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
        user.getCategory() == category
        and:
        user.getMail() == mail
        cleanup:
        println "cleanup"
    }

}
