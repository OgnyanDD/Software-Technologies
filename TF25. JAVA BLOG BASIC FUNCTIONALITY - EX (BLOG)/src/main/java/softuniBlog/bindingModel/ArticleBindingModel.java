package softuniBlog.bindingModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class ArticleBindingModel {

    @Null
    private String link;

    @NotNull
    private String title;

    @NotNull
    private String publicationType;

    @NotNull
    private String content;

    @Null
    public String getLink() {
        return link;
    }

    public void setLink(@Null String link) {
        this.link = link;
    }

    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NotNull String title) {
        this.title = title;
    }

    @NotNull
    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String publicationType) {
        this.publicationType = publicationType;
    }

    @NotNull
    public String getContent() {
        return content;
    }

    public void setContent(@NotNull String content) {
        this.content = content;
    }
}