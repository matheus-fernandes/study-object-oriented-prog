package patterns.bridge.views;

import patterns.bridge.resources.Resource;

public class ListItemView extends View {
    public ListItemView(Resource resource) {
        super(resource);
    }

    @Override
    public String html() {
        return """
           <div class="list-item">
                <div class="aside-left">
                    <img src="%s" class="list-image">
                <div/>
                <div class="content">
                    <h3 class="item-title">%s: %s</h3>
                    <label>%s: %s</label>
                </div>
           </div>
        """.formatted(
                resource.getImageUrl(),
                resource.getTitleLabel(),
                resource.getTitle(),
                resource.getSnippetLabel(),
                resource.getSnippet()
        );
    }
}
