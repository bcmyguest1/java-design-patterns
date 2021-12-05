package factory.method;

import factory.method.post.BlogPost;
import factory.method.post.Post;
import factory.method.post.PostTypes;
import factory.method.post.VideoPost;
import jdk.jshell.spi.ExecutionControl;

import java.io.File;

public class PostFactory {
    public Post makePost(PostTypes postType, String title, String description, File video) {
        if (postType == PostTypes.BLOG) {
            return new BlogPost(title, description);
        } else if (postType == PostTypes.VIDEO) {
            return new VideoPost(title, description, video);
        } else {
            throw new UnsupportedOperationException("Invalid post type");
        }
    }
}
