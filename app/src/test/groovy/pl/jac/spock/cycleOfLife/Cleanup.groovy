package pl.jac.spock.cycleOfLife

import spock.lang.Specification

/**
 * show in console
 */
class Cleanup extends Specification {
    def cleanup() {
        println "cleanup ext"
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
        cleanup:
        println "cleanup in test2"
    }
}