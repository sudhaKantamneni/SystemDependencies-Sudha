package com.sysdependency.command;

public class CommandException extends Exception {
File file = new File(".\\SystemDependencies-master\\src\\main\\resources\\input.txt"); 
    public CommandException() {
    }

    public CommandException(String message) {
        super(message);
    }

    public CommandException(String message, Throwable cause) {
        super(message, cause);
    }
}
