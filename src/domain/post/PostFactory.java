package domain.post;

import domain.post.BlogPost;
import domain.post.Post;
import domain.post.PostTypes;
import domain.post.VideoPost;

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
