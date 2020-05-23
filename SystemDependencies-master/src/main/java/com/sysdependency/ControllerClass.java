package com.sysdependency;

import com.sysdependency.command.CommandException;

import java.io.File;
import java.util.Scanner;

public class ControllerClass {

    public static void main(String[] args) throws Exception {


File file = new File("C:\\Users\\admin\\git\\SystemDependencies-Sudha\\SystemDependencies-master\\src\\main\\resources\\input.txt"); 
 
    		  
        InputParser parser = new InputParser();
        CommandFactoryClass commandFactory = CommandFactoryClass.init();
        Scanner scanner = new Scanner(file);

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
