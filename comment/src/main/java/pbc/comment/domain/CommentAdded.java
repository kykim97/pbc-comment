package pbc.comment.domain;

import java.util.*;
import lombok.*;
import pbc.comment.domain.*;
import pbc.comment.infra.AbstractEvent;

@Data
@ToString
public class CommentAdded extends AbstractEvent {

    private Long topicId;
    private String userId;
    private String repliedId;
    private String profileImg;
    private String comment;
    private Date timeStamp;

    public CommentAdded(Comment aggregate) {
        super(aggregate);
    }

    public CommentAdded() {
        super();
    }
}
