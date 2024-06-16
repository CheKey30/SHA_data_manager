package org.sha.sha_data_manager.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.sha.sha_data_manager.dao.BiliBiliDataMapper;
import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.sha.sha_data_manager.service.DataRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataRecordServiceImpl extends ServiceImpl<BiliBiliDataMapper, BilibiliVideoInfo> implements DataRecordService {

    final
    BiliBiliDataMapper biliBiliDataMapper;

    public DataRecordServiceImpl(BiliBiliDataMapper biliBiliDataMapper) {
        this.biliBiliDataMapper = biliBiliDataMapper;
    }

    @Override
    public void recordBilibiliHotVideo(List<BilibiliVideoInfo> bilibiliVideoInfoList) {
        bilibiliVideoInfoList.forEach(biliBiliDataMapper::insertRecord);
    }
}
