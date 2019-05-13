package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
*@Description: Banner管理
*@Param:
*@return:
*@Author: zhaohe
*@date: 2019-05-13
*/
@Entity
@Table(name = "banner")
@Data
public class Banner implements Serializable {
    private static final long serialVersionUID = 4445174803927173527L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String imgUrl;

    private String href;

    private Date createTime;

    private Date updateTime;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", href=").append(href);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}