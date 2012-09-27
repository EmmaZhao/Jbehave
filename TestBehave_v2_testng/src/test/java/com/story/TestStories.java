package com.story;

import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.common.EmbedderBase;
import com.step.TestStep;

public class TestStories extends EmbedderBase {

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new TestStep());//設定需要映射的step類
    }
 
}