package com.sysdependency.command;

import com.sysdependency.model.Program;
import com.sysdependency.service.ServiceException;

import java.util.Set;

/*
Class to add List command
*/
public class ListCommand extends AbstractCommand {
    @Override
    public String executeInternal(String[] args) throws CommandException, ServiceException {
        verifyHasExactNumberOfArguments(args, 1);

        Set<Program> installed = dependencyManager.list();

        StringBuffer response = new StringBuffer();
        for (Program program : installed) {
            response.append("\t").append(program.getName()).append("\n");
        }

        return response.toString();
    }
}
