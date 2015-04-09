package com.alexecollins.docker.anttasks;

public class ValidateTask extends AbstractTask {

    @Override
    public void execute() {
        dockerOrchestrator.validate();
    }
}
