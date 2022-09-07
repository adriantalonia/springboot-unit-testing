package com.testing;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) test_names
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)

//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach Running");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("@AfterEach Running");
    }

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    static void tearDownAfterALl() {
        System.out.println("@AfterAll");
    }

    @Order(1)
    @Test
    @DisplayName("Equals And Not Equals")
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9));
    }

    @Order(2)
    @Test
    @DisplayName("Null And Not Null")
    void testNUllAndNotNull() {
        System.out.println("Running test: testNUllAndNotNull");

        String str1 = null;
        String str2 = "test";

        assertNull(demoUtils.checkNull(str1));
        assertNotNull(demoUtils.checkNull(str2));
    }

    @Order(3)
    @Test
    void testSameAndNotSame() {
        //given
        String str = "Luv2Code";
        //when

        //then
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to the same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to the same object");
    }

    @Order(4)
    @Test
    void testTrueFalse() {
        //given
        int gradeOne = 10;
        int gradeTwo = 5;

        //when

        //then
        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo));
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne));
    }

    @Order(5)
    @Test
    void testArrayEquals() {
        //given
        String[] stringArray = {"A", "B", "C"};
        //when

        //then
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Array should be the same");
    }

    @Order(6)
    @Test
    void testIterableEquals() {
        //given
        List<String> list = List.of("luv", "2", "code");

        //when

        //then
        assertIterableEquals(list, demoUtils.getAcademyInList(), "Expected list should be same as actual list");
    }

    @Order(7)
    @DisplayName("LinesMatch")
    @Test
    void testLinesMatch() {
        //given
        List<String> list = List.of("luv", "2", "code");

        //when

        //then
        assertLinesMatch(list, demoUtils.getAcademyInList(), "Lines should match");
    }

    @Order(8)
    @DisplayName("Throws and does not throw")
    @Test
    void testThrowException() {
        assertThrows(Exception.class, () -> {
            demoUtils.throwException(-1);
        }, "Should throw exception");

        assertDoesNotThrow(() -> {
            demoUtils.throwException(5);
        }, "Should not throw exception");
    }

    @Order(9)
    @DisplayName("Timeout")
    @Test
    void testCheckTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
            demoUtils.checkTimeout();
        }, "Method should execute in 3 seconds");
    }

}
