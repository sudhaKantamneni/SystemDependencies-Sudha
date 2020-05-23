package com.sysdependency;

import com.sysdependency.command.*;
import com.sysdependency.service.DependencyManager;
import com.sysdependency.service.DependencyManagerImpl;

import java.util.HashMap;
import java.util.Map;

public class CommandFactoryClass{
   
    public static final String INSTALL_COMMAND = "INSTALL";
    public static final String REMOVE_COMMAND = "REMOVE";
	 public static final String DEPEND_COMMAND = "DEPEND";
    public static final String LIST_COMMAND = "LIST";

    Map<String, Command> allcommands;

    private CommandFactoryClass() {
        allcommands = new HashMap<>();
    }

    public void addCommand(String name, Command command) {
        allcommands.put(name, command);
    }

    public String execute(String[] args) throws CommandException {
        Command command = allcommands.get(args[0]);
        if (command != null) {
            return command.execute(args);
        }
        return null;
    }

    public static CommandFactoryClass init() {
    	CommandFactoryClass factory = new CommandFactoryClass();
        DependencyManager dependencyManager = new DependencyManagerImpl();

        DependCommand dependCommand = new DependCommand();
        dependCommand.setDependencyManager(dependencyManager);
        factory.addCommand(DEPEND_COMMAND, dependCommand);

        InstallCommand installCommand = new InstallCommand();
        installCommand.setDependencyManager(dependencyManager);
        factory.addCommand(ADD_COMMAND, installCommand);

        RemoveCommand removeCommand = new RemoveCommand();
        removeCommand.setDependencyManager(dependencyManager);
        factory.addCommand(REMOVE_COMMAND, removeCommand);

        ListCommand listCommand = new ListCommand();
        listCommand.setDependencyManager(dependencyManager);
        factory.addCommand(LIST_COMMAND, listCommand);

        return factory;
    }
}
