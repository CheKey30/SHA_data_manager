package org.sha.sha_data_manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiliBiliDataMapper extends BaseMapper<BilibiliVideoInfo> {
    int insertRecord(BilibiliVideoInfo bilibiliVideoInfo);

    List<BilibiliVideoInfo> getLatestHotVideos();
}
