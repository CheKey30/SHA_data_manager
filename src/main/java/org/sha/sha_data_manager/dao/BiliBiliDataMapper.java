package org.sha.sha_data_manager.dao;

import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiliBiliDataMapper {
    int insertRecord(BilibiliVideoInfo bilibiliVideoInfo);

    List<BilibiliVideoInfo> getLatestHotVideos();
}
