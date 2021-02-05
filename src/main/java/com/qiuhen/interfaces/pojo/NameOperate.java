package com.qiuhen.interfaces.pojo;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.pojo
 * @ClassName: NameOperate
 * @Author: qiuhen
 * @Description: 名称生成实体类
 * @Date: 2021/1/25 13:12
 * @Version: 1.0
 */
public class NameOperate {
    private String num;
    private String operate;
    private String sqlUrl;
    private String username;
    private String password;

    public NameOperate(String num, String operate, String sqlUrl, String username, String password) {
        this.num = num;
        this.operate = operate;
        this.sqlUrl = sqlUrl;
        this.username = username;
        this.password = password;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getSqlUrl() {
        return sqlUrl;
    }

    public void setSqlUrl(String sqlUrl) {
        this.sqlUrl = sqlUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "NameOperate{" +
                "num=" + num +
                ", operate='" + operate + '\'' +
                ", sqlUrl='" + sqlUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
