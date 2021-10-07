package pl.jac.spock.cycleOfLife

import spock.lang.Specification

/**
 * show in console
 */
class Setup extends Specification {
    def setup() {
        println "setup ext"
    }

    def test1() {
        expect:
        println "expect test1"
        Math.min(1, 2) == 1
    }

    def test2() {
        setup: // "to jest alias do given"
        println "setup ext"
        expect:
        println "expect test2"
        Math.min(1, 2) == 1
    }
}
