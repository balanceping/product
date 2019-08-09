package com.imooc.product.utils;

import com.imooc.product.vo.ResultVo;

/**
 * @author ph
 * @create 2019--08-09
 */
public class ResultVoUtil {

    public static ResultVo success(Object o){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(o);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }
}
