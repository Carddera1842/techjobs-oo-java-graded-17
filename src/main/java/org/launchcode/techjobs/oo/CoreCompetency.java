package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    public CoreCompetency(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return getValue();
    }
}