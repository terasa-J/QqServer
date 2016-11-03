package com.eva.pojo;

import java.util.Date;

public class CommentsReturn {
    private Long id;

    private Long clientCommentId;

    private String clientId;

    private Date returnCommentDate;

    private String returnContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getReturnCommentDate() {
        return returnCommentDate;
    }

    public void setReturnCommentDate(Date returnCommentDate) {
        this.returnCommentDate = returnCommentDate;
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent == null ? null : returnContent.trim();
    }
}