package com.qiuhen.interfaces.pojo;

import java.io.Serializable;
import java.util.Date;


/**
 * img_u
 * @author 
 */

public class ImgU implements Serializable {
    private String id;                         //id

    private String name;

    private Date time;

    private String author;

    private String imgUrl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}