package org.sha.sha_data_manager.service;

import org.sha.sha_data_manager.dao.BiliBiliDataMapper;
import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataRecordService {

    final BiliBiliDataMapper biliBiliDataMapper;

    public DataRecordService(BiliBiliDataMapper biliBiliDataMapper) {
        this.biliBiliDataMapper = biliBiliDataMapper;
    }

    public void recordBilibiliHotVideo(List<BilibiliVideoInfo> bilibiliVideoInfoList) {
        bilibiliVideoInfoList.forEach(biliBiliDataMapper::insertRecord);
    }
}
