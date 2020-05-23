package com.salesforce.rpt.dependency;

import com.sysdependency.command.CommandException;

import java.io.File;
import java.util.Scanner;

public class ControllerClass {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new Exception("Expected Syntax: Controller <input file>");
        }

        InputParser parser = new InputParser();
        CommandFactoryClass commandFactory = CommandFactoryClass.init();
        Scanner scanner = new Scanner(new File(args[0]));

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
            String[] arguments = parser.parse(line);
            try {
                String response = commandFactory.execute(arguments);
                if (response != null) {
                    System.out.print(response);
                }
            } catch (CommandException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

}
