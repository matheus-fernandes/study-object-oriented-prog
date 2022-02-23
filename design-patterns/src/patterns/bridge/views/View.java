package patterns.bridge.views;

import patterns.bridge.resources.Resource;

public abstract class View {
    protected final Resource resource;

    protected View(Resource resource) {
        this.resource = resource;
    }

    public abstract String html();
}
