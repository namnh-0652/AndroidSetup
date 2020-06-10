package com.namnh.androidsetup.logic

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainLogicTest {
    private lateinit var mainLogic: MainLogic
    @Before
    fun setup() {
        mainLogic = MainLogic()
    }

    @Test
    fun `hello world`() {
        assertEquals("Hello, World!", mainLogic.greet())
    }

    @Test
    fun `hello NamNH`() {
        assertEquals("Hello, NamNH!", mainLogic.greet("NamNH"))
    }

    @Test
    fun `add positive`() {
        assertEquals(2, mainLogic.add(1, 1))
        assertEquals(4, mainLogic.add(1, 3))
    }

    @Test
    fun `add negative`() {
        assertEquals(2, mainLogic.add(-1, 3))
        assertEquals(4, mainLogic.add(-1, 5))
    }

    @Test
    fun `add positive and negative`() {
        assertEquals(-1, mainLogic.add(-3, 2))
        assertEquals(2, mainLogic.add(-3, 5))
    }

    @Test
    fun `has duplicated number`() {
        assertTrue(mainLogic.hasDuplicatedNumber(listOf(1, 2, 3, 4, 2), 2))
        assertTrue(mainLogic.hasDuplicatedNumber(listOf(1, 4, 3, 4, 2), 4))
    }

    @Test
    fun `has no duplicated number`() {
        assertFalse(mainLogic.hasDuplicatedNumber(listOf(1, 2, 3, 4), 1))
        assertFalse(mainLogic.hasDuplicatedNumber(listOf(1, 2, 3, 4), 2))
        assertFalse(mainLogic.hasDuplicatedNumber(listOf(1, 2, 3, 4), 0))
        assertFalse(mainLogic.hasDuplicatedNumber(listOf(), 0))
    }
}
