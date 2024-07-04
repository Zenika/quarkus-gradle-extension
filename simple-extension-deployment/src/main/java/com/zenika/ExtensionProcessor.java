package com.zenika;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class ExtensionProcessor {

    @BuildStep
    public FeatureBuildItem createFeatureBuildItem() {
        return new FeatureBuildItem("zenika-extension");
    }

}
