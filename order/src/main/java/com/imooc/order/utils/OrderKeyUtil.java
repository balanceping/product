package com.imooc.order.utils;

import java.util.Random;

/**
 * @author ph
 * @create 2019--08-09
 */
public class OrderKeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     */
    public static synchronized String getUniqueKey(){
        Random random =new Random();
        Integer number =random.nextInt(900000)+100000;

        return  System.currentTimeMillis()+String.valueOf(number);
    }
}
