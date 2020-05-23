package com.sysdependency.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Program tp find the dependency keyword , get depency and add dependencies
*/
public class Program {
    private String name;
    private Set<Program> dependencies;

    public Program(String name) {
        this.name = name;
        dependencies = new HashSet<>();
    }

    public String getName() {
        return name;
    }

//get dependency
    public Set<Program> getDependencies() {
        return Collections.unmodifiableSet(dependencies);
    }

//add depencency
    public boolean addDependency(Program program) {
        return dependencies.add(program);
    }

//overrideing Object class methods

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Program program = (Program) other;

        return name.equals(program.name);

    }

//overrideing Object class methods
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static Set<Program> toProgram(String[] programs) {
        Set<Program> set = new HashSet<>(programs.length);
        for (String programName : programs) {
            set.add(new Program(programName));
        }
        return set;
    }
}
