package org.sha.sha_data_manager.service;

import org.sha.sha_data_manager.dao.BiliBiliDataMapper;
import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSearchService {
    final
    BiliBiliDataMapper biliBiliDataMapper;

    public DataSearchService(BiliBiliDataMapper biliBiliDataMapper) {
        this.biliBiliDataMapper = biliBiliDataMapper;
    }

    public String ping() {
        return "pong";
    }

    public List<BilibiliVideoInfo> getBiliBiliLatest() {
        return biliBiliDataMapper.getLatestHotVideos();
    }
}
