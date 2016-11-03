package com.eva.pojo;

public class Map {
    private Long id;

    private String clientId;

    private String type;

    private String explian;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getExplian() {
        return explian;
    }

    public void setExplian(String explian) {
        this.explian = explian == null ? null : explian.trim();
    }
}