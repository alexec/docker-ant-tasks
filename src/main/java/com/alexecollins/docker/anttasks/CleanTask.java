package com.alexecollins.docker.anttasks;

public class CleanTask extends AbstractTask {

    @Override
    public void execute() {
        dockerOrchestrator.clean();
    }
}
