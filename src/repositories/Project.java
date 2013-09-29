package repositories;

import java.util.ArrayList;
import java.util.Collection;

public class Project {
	private Collection<Module> modules = new ArrayList<Module>();

	public Collection<Module> getModules() {
		return modules;
	}

	public void setModules(Collection<Module> modules) {
		this.modules = modules;
	}
	
	
}
