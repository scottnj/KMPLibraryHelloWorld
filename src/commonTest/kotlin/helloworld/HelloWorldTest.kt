package helloworld

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class HelloWorldTest {

    private lateinit var helloWorld: HelloWorld

    @BeforeTest
    fun setUp() {
        helloWorld = HelloWorld()
    }

    @Test
    fun get_message() {
        assertEquals("Hello Jaqxues", helloWorld.getMessage("Jaqxues"))
    }
}