package com.eva.pojo;

public class ClientsConcern {
    private Long id;

    private String clientId;

    private String concernedClientId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getConcernedClientId() {
        return concernedClientId;
    }

    public void setConcernedClientId(String concernedClientId) {
        this.concernedClientId = concernedClientId == null ? null : concernedClientId.trim();
    }
}