package com.steve.train.business.req;

import com.steve.train.common.req.PageReq;

/*
 * @author     : Steve Hu
 * @date       : 2023-10-29 10:23:08
 * @description: TrainStation查询请求封装类（FreeMarker生成）
 */
public class TrainStationQueryReq extends PageReq {
    // 用于存储搜索请求的车次号字段。若该属性为空，则请求为普通的批量查询
    private String trainCode;

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    @Override
    public String toString() {
        return "TrainStationQueryReq{" +
                "trainCode='" + trainCode + '\'' +
                "} " + super.toString();
    }
}
