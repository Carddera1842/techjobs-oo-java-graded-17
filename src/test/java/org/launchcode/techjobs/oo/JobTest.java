package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(job1.getName(), "Product tester");
        assertTrue(job1.getName() instanceof String);
        assertFalse(job1.getName().equals(null));

        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertTrue(job1.getEmployer() instanceof Employer);
        assertFalse(job1.getEmployer().equals(null));

        assertEquals(job1.getLocation().getValue(), "Desert");
        assertTrue(job1.getLocation() instanceof Location);
        assertFalse(job1.getName().equals(null));

        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertFalse(job1.getPositionType().equals(null));

        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertFalse(job1.getCoreCompetency().equals(null));
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String newLine = System.lineSeparator();
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.toString().startsWith(newLine));
        assertTrue(job1.toString().endsWith(newLine));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testLabelsAndData =
                System.lineSeparator() +
                "ID: " + job1.getId() + System.lineSeparator() +
                "Name: " + job1.getName() + System.lineSeparator() +
                "Employer: " + job1.getEmployer() + System.lineSeparator() +
                "Location: " + job1.getLocation() + System.lineSeparator() +
                "Position Type: " + job1.getPositionType() + System.lineSeparator() +
                "Core Competency: " + job1.getCoreCompetency() +
                System.lineSeparator();
        assertEquals(testLabelsAndData, job1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals(job1.toString(), "OOPS! This job does not seem to exist.");

    }


}
