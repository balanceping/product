package com.imooc.order.enums;

import lombok.Getter;

/**
 * @author ph
 * @create 2019--08-09
 */
@Getter
public enum OrderSatusEnum {
      NEW(0,"新订单"),
      FINESHED(1,"完结"),
      CANCEL(2,"取消"),
      ;

      private  Integer code ;

      private String message;

    OrderSatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
