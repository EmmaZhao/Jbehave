package com.test;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.testng.annotations.Test;

import com.story.TestStories;
import com.story.loginYahoo;

public class TraderStoryRunner {
	@Test(groups={"test"})
    public void runClasspathLoadedStoriesAsJUnit() {
        // Embedder defines the configuration and candidate steps
        Embedder embedder = new TestStories();
        List<String> storyPaths = new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()),"**/TestStories.story",""); // use StoryFinder to look up paths
        embedder.runStoriesAsPaths(storyPaths);
    }
	@Test(groups={"test"})
    public void runClasspathLoadedStories() {
        // Embedder defines the configuration and candidate steps
        Embedder embedder = new loginYahoo();
        List<String> storyPaths = new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()),"**/loginYahoo.story",""); // use StoryFinder to look up paths
        embedder.runStoriesAsPaths(storyPaths);
    }
}
