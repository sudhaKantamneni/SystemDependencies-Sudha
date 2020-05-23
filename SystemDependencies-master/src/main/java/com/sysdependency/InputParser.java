package com.sysdependency;

import com.sysdependency.command.CommandExceptionClass;

/*
Class used to parse the input String.
*/
public class InputParser {

    public String[] parse(String cString) throws CommandExceptionClass {
        return cString.split("\\s+");
    }

}
