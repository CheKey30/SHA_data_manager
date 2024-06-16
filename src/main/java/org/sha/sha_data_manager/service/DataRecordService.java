package org.sha.sha_data_manager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.sha.sha_data_manager.dao.BiliBiliDataMapper;
import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DataRecordService extends IService<BilibiliVideoInfo> {
    public void recordBilibiliHotVideo(List<BilibiliVideoInfo> bilibiliVideoInfoList);
}
