package pbc.comment.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pbc.comment.CommentApplication;
import pbc.comment.domain.CommentAdded;

@Entity
@Table(name = "Comment_table")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long topicId;

    private String userId;

    private String repliedId;

    private String profileImg;

    private String comment;

    private Date timeStamp;

    @PostPersist
    public void onPostPersist() {
        CommentAdded commentAdded = new CommentAdded(this);
        commentAdded.publishAfterCommit();
    }

    public static CommentRepository repository() {
        CommentRepository commentRepository = CommentApplication.applicationContext.getBean(
            CommentRepository.class
        );
        return commentRepository;
    }

    public void addComment(AddCommentCommand addCommentCommand) {
        CommentAdded commentAdded = new CommentAdded(this);
        commentAdded.publishAfterCommit();
    }
}
