package com.qiuhen.interfaces.pojo;

import java.util.Date;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.pojo
 * @ClassName: Book
 * @Author: qiuhen
 * @Description: 图书实体
 * @Date: 2020/5/7 15:57
 * @Version: 1.0
 */
public class Book {

    private String id;
    private String name;
    private String author;
    private String img_url;
    private Double price;
    private Date time;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", img_url='" + img_url + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
