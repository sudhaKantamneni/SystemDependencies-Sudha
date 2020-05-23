package com.sysdependency.command;

import com.sysdependency.model.Program;
import com.sysdependency.service.ServiceException;

import java.util.Arrays;

public class DependCommand extends AbstractCommand {
    @Override
    public String executeInternal(String[] args) throws CommandException, ServiceException {
        verifyHasMinimumNumberOfArguments(args, 3);

        dependencyManager.depend(new Program(args[1]),
                Program.toProgram(Arrays.copyOfRange(args, 2, args.length)));

        return null;
    }
}
