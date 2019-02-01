package com.example.apptest;


import org.junit.*;



import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    int totalNumberOfApplicants = 0;
    int totalNumberOfAcceptableApplicants = 10;

    @Before
    public void setData(){
        this.totalNumberOfApplicants = 9;
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testAssertions() {
        assertTrue((this.totalNumberOfApplicants != this.totalNumberOfAcceptableApplicants));
    }
}