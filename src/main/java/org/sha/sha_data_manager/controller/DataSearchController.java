package org.sha.sha_data_manager.controller;

import org.sha.sha_data_manager.dto.ShaPagedResponse;
import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.sha.sha_data_manager.service.DataSearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getData")
public class DataSearchController {
    private DataSearchService dataSearchService;

    public DataSearchController(DataSearchService dataSearchService) {
        this.dataSearchService = dataSearchService;
    }

    @GetMapping("/ping")
    public String dataSearch() {
        return dataSearchService.ping();
    }

    @GetMapping("/bilibili/latest")
    public ShaPagedResponse<BilibiliVideoInfo> getBiliBiliLatest() {
        return ShaPagedResponse.success(dataSearchService.dataSearchBiliBiliLatest(), 1, 10);
    }
}
