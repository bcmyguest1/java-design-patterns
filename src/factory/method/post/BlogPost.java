package factory.method.post;

import java.util.UUID;

public class BlogPost implements Post {
    private final String title;
    private final String description;
    private final UUID postId;
    private boolean deleted;

    public BlogPost(String title, String description) {
        this.title = title;
        this.description = description;
        this.postId = UUID.randomUUID();
        deleted = false;
    }

    @Override
    public UUID publish() {
        // make a call to a web service to set a
        System.out.println(String.format("Publishing post: %s", this.toString()));
        return postId;
    }

    @Override
    public boolean delete() {
        deleted = true;
        System.out.println(String.format("Deleting post: %s", this.toString()));
        return deleted;
    }

    @Override
    public String toString() {
        return String.format("BlogPost: %s - description: %s - postId: %s", title, description, postId);
    }
}
