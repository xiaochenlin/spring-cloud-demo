package com.seata.storage.domain;

import lombok.Data;

@Data
public class Storage {


    private Integer id;

    private Integer productId;

    private Integer  total;

    private Integer used;


    private Integer residue;

}
