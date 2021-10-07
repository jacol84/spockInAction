package pl.jac.spock.cycleOfLife

import spock.lang.Specification
/**
 * show in console
 */
class SetupSpec extends Specification {
    def setupSpec() {
        println "setup spec ext"
    }

    def test1() {
        expect:
        println "expect test1"
        Math.min(1, 2) == 1
    }

    def test2() {
        expect:
        println "expect test2"
        Math.min(1, 2) == 1
    }
}
