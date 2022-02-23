package patterns.bridge.views;

import patterns.bridge.resources.Resource;

public class CardView extends View {
    public CardView(Resource resource) {
        super(resource);
    }

    @Override
    public String html() {
        return """
           <div class="card">
                <div class="card-header">
                    <img src="%s" class="card-image">
                    <h3 class="card-title">%s: %s</h3>
                <div/>
                <div class="card-body">
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
