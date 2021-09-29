
plugins {
    groovy
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.spockframework:spock-core:2.0-groovy-3.0")
}

application {
    mainClass.set("pl.jac.spock.App")
}

tasks.test {
    useJUnitPlatform()
}
