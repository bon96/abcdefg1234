package org.bon.ohjelmointitehtava.tehtava2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tommi
 * Date: 01/11/2020
 * Time: 20.12
 */

public class SmallestGapTest {

    @Test
    public void gapShouldBeOne() {
        Assert.assertEquals(SmallestGap.getSmallestGap(new Integer[]{1, 3, 4, 5}), 1);
    }

    @Test
    public void noGapShouldBeFound() {
        Assert.assertEquals(SmallestGap.getSmallestGap(new Integer[]{1, 2, 3, 4}), -1);
    }

    @Test
    public void gapShouldBeFive() {
        Assert.assertEquals(SmallestGap.getSmallestGap(new Integer[]{1, 7, 100, 1000}), 5);
    }

    @Test
    public void testGapLarge() {
        Assert.assertEquals(SmallestGap.getSmallestGap(new Integer[]{1, 2, Integer.MAX_VALUE}), Integer.MAX_VALUE - 3);
    }

    @Test
    public void testSorting() {
        Assert.assertEquals(SmallestGap.getSmallestGap(new Integer[]{3, 1000, 500, 1, 5000}), 1);
    }

    @Test
    public void testMultipleSameGapNoDuplicates() {
        Assert.assertEquals(SmallestGap.getSmallestGap(new Integer[]{1, 3, 5}), 1);
    }

    @Test
    public void testMultipleSameGapWithDuplicates() {
        Assert.assertEquals(SmallestGap.getSmallestGap(new Integer[]{1, 2, 3, 5, 3, 5, 9, 11, 15}), 1);
    }

    @Test
    public void testInputOutput() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = System.out;

        System.setOut(new PrintStream(baos));
        SmallestGap.main("1, 4, 10".split("\\s+"));
        System.setOut(out);

        Assert.assertEquals("2", baos.toString().replaceAll("\\s+", ""));
    }

    @Test
    public void testNoInput() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = System.out;

        System.setOut(new PrintStream(baos));
        SmallestGap.main(new String[0]);
        System.setOut(out);

        Assert.assertEquals("-1", baos.toString().replaceAll("\\s+", ""));
    }

    @Test
    public void testNotEnoughInputForResults() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = System.out;

        System.setOut(new PrintStream(baos));
        SmallestGap.main(new String[]{"1"});
        System.setOut(out);

        Assert.assertEquals("-1", baos.toString().replaceAll("\\s+", ""));
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SmallestGapTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }

        System.out.println("Passed " + (result.getRunCount() - result.getFailureCount()) + "/" + result.getRunCount() +
                " tests in " + result.getRunTime() + "ms");
    }
}
