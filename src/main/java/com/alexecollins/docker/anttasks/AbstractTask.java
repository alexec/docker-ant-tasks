package com.alexecollins.docker.anttasks;

import com.alexecollins.docker.orchestration.DockerOrchestrator;
import com.alexecollins.docker.orchestration.model.BuildFlag;
import com.github.dockerjava.core.DockerClientBuilder;
import org.apache.tools.ant.Task;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

abstract class AbstractTask extends Task {
    protected Set<BuildFlag> buildFlags = new HashSet<BuildFlag>();
    private File work = new File("build/docker");
    private File src = new File("src/main/docker");
    private String user = System.getProperty("user.name");
    protected DockerOrchestrator dockerOrchestrator;

    @Override
    public void init() {
        dockerOrchestrator = DockerOrchestrator
                .builder()
                .docker(DockerClientBuilder.getInstance().build())
                .user(user)
                .src(src)
                .workDir(work)
                .project(getProject().getName())
                .rootDir(getProject().getBaseDir())
                .buildFlags(buildFlags)
                .properties(System.getProperties())
                .build();
    }

    public void setWork(File work) {
        this.work = work;
    }

    public void setSrc(File src) {
        this.src = src;
    }

    public void setUser(String user) {
        this.user = user;
    }
}