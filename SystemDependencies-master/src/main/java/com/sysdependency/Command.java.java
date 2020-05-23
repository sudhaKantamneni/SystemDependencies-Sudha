package com.sysdependency;

import com.sysdependency.command.CommandException;

public interface Command {
     String execute(String[] args) throws CommandException;
}
