package factory.method;

import domain.post.Post;
import domain.post.PostTypes;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        make and publish a few posts then delete one
        PostFactory factory = new PostFactory();
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(factory.makePost(PostTypes.BLOG, "post1","this should be a blog post", null));
        posts.add(factory.makePost(PostTypes.VIDEO, "post2","this should be a blog post", new File("resources/test_file.mp4")));

        posts.forEach(Post::publish);
        posts.get(1).delete();
    }
}
