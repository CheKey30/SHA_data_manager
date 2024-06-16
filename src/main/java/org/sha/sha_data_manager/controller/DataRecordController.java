package org.sha.sha_data_manager.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.sha.sha_data_manager.dto.ShaResponse;
import org.sha.sha_data_manager.entity.BilibiliVideoInfo;
import org.sha.sha_data_manager.service.DataRecordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recordData")
public class DataRecordController {
    private DataRecordService dataRecordService;

    public DataRecordController(DataRecordService dataRecordService) {
        this.dataRecordService = dataRecordService;
    }

    @PostMapping("/bilibili/recordHotVideo")
    public ShaResponse recordHotVideo(@RequestBody List<BilibiliVideoInfo> videoInfos) {
        System.out.println("start recordHotVideo");
        dataRecordService.recordBilibiliHotVideo(videoInfos);
        return ShaResponse.success(null);
    }
}
