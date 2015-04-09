package com.alexecollins.docker.anttasks;

public class PushTask extends AbstractTask {

    @Override
    public void execute() {
        dockerOrchestrator.push();
    }
}
