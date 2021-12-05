package factory.method.post;

import java.io.File;
import java.util.UUID;

public class VideoPost implements Post {

    private final String title;
    private final String description;
    private final File video;
    private final UUID postId;
    private boolean deleted;

    public VideoPost(String title, String description, File video) {
        this.title = title;
        this.description = description;
        this.video = video;
        this.postId = UUID.randomUUID();
        deleted = false;
    }

    @Override
    public UUID publish() {
        // make a call to a web service to upload the video to the server with the title and description
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
        return String.format("BlogPost: %s - file: %s - postId: %s", title, video.getName(), postId);
    }
}
