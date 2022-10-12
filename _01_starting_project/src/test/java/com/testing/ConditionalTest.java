package com.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA #123 is resolved")
    void basicTest() {
        // execute method perform assertions
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForWindowsAndMacOnly() {

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinux() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyJava17() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testForOnlyJava11() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_19)
    void testForOnlyJavaRange() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named="CODE_ENV", matches = "DEV")
    void testOnlyForDevEnvironment() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named="SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {

    }



}
