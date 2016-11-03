package com.eva.pojo;

import java.util.Date;

public class Comments {
    private Long clientCommentId;

    private String clientId;

    private String commentPosition;

    private Long commentId;

    private Date commentDate;

    private String commentContent;

    public Long getClientCommentId() {
        return clientCommentId;
    }

    public void setClientCommentId(Long clientCommentId) {
        this.clientCommentId = clientCommentId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getCommentPosition() {
        return commentPosition;
    }

    public void setCommentPosition(String commentPosition) {
        this.commentPosition = commentPosition == null ? null : commentPosition.trim();
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}