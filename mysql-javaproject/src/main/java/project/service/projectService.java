package project.service;

import project.dao.ProjectDao;
import projects.entity.Project;

public class projectService {
	private ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

}
