package com.alexecollins.docker.anttasks;

public class StopTask extends AbstractTask {

    @Override
    public void execute() {
        dockerOrchestrator.stop();
    }
}
