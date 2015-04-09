package com.alexecollins.docker.anttasks;

import com.alexecollins.docker.orchestration.model.BuildFlag;

public class BuildTask extends AbstractTask {

    @Override
    public void execute() {
        dockerOrchestrator.build();
    }

    public void setFlags(String flags) {
        for (String flag : flags.split(",")) {
            this.buildFlags.add(BuildFlag.valueOf(flag));
        }
    }
}
