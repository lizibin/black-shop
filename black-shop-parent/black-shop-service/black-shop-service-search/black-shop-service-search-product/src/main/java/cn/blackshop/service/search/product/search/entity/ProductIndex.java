package cn.blackshop.search.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author liusuibiao
 * @Description TODO
 * @Date 2018/12/17 16:19
 */

@Data
public class ProductIndex implements Serializable {

    private Long prodId;

    private String name;

    private String pic;

}
