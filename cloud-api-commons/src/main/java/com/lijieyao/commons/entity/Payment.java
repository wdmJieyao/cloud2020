package com.lijieyao.commons.entity;

import lombok.Data;

/**
 * @author lijieyao
 */
@Data
public class Payment {
    /**
     * 主键
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String serial;
}

