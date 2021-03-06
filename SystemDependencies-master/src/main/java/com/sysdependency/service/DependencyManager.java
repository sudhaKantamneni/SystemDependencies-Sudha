package com.sysdependency.service;

import com.sysdependency.model.Program;
import java.util.Set;

public interface DependencyManager {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    Set<Program> list() throws ServiceException;

    void depend(Program source, Set<Program> dest) throws ServiceException;

    Set<Program> add(Program program) throws ServiceException;

    Set<Program> remove(Program program) throws ServiceException;
}
