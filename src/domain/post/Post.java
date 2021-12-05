package domain.post;

import java.util.UUID;

public interface Post {
    public UUID publish();
    public boolean delete();
}

