package factory.method.post;

import java.io.File;
import java.util.UUID;

public interface Post {
    public UUID publish();
    public boolean delete();
}

