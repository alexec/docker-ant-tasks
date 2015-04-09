package com.alexecollins.docker.anttasks;

public class StartTask extends AbstractTask {

    @Override
    public void execute() {
        dockerOrchestrator.start();
    }
}
