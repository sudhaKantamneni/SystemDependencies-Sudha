package com.sysdependency;

import com.sysdependency.command.CommandException;

/*
Class used to parse the input String.
*/
public class InputParser {

    public String[] parse(String cString) throws CommandException {
        return cString.split("\\s+");
    }

}
