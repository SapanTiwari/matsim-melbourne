package io.github.agentsoz.matsimmelbourne.io.github.agentsoz.matsimmelbourne.demand.latch;

import io.github.agentsoz.matsimmelbourne.demand.latch.AddWorkPlacesToPopulation;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * Tests the AddWorkingPlacesToPopulation class
 */
public class AddWorkPlacesToPopulationTest {

    String[] args = {

            "carAsDriver"
    };

    @Test
    @Ignore
    public final void addworkPlacestoPopTestMain() throws IOException {
        // FIXME: not really testing anything at the moment;
        // ***********FIXED************ FIXME: also relies on availability of population-from-latch.xml which may not
        // exist (think up a
        // dir structure for this)
        // FIXME: use the util.getInputDirectory()/util.getOutputDirectory() like scheme for finding expected/output files
        // Maybe look at: https://github.com/agentsoz/bdi-abm-integration/blob/kaibranch/examples/bushfire/src/test/java/io/github/agentsoz/ees/FireAreaMaldon600Test.java
        AddWorkPlacesToPopulation.main(args);

    }
}