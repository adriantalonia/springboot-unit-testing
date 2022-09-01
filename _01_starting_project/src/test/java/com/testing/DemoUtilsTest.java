package com.testing;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) test_names
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
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

    @Test
    @DisplayName("Equals And Not Equals")
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9));
    }

    @Test
    @DisplayName("Null And Not Null")
    void testNUllAndNotNull() {
        System.out.println("Running test: testNUllAndNotNull");

        String str1 = null;
        String str2 = "test";

        assertNull(demoUtils.checkNull(str1));
        assertNotNull(demoUtils.checkNull(str2));
    }

    @Test
    void testSameAndNotSame() {
        //given
        String str = "Luv2Code";
        //when

        //then
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to the same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to the same object");
    }

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

    @Test
    void testArrayEquals() {
        //given
        String[] stringArray = {"A", "B", "C"};
        //when

        //then
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Array should be the same");
    }

    @Test
    void testIterableEquals() {
        //given
        List<String> list = List.of("luv", "2", "code");

        //when

        //then
        assertIterableEquals(list, demoUtils.getAcademyInList(), "Expected list should be same as actual list");
    }

    @Test
    void testLinesMatch() {
        //given
        List<String> list = List.of("luv", "2", "code");

        //when

        //then
        assertLinesMatch(list, demoUtils.getAcademyInList(), "Lines should match");
    }


}
