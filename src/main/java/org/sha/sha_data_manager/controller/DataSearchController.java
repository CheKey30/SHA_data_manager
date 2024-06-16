package org.sha.sha_data_manager.controller;

import org.sha.sha_data_manager.service.DataSearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/getData")
public class DataSearchController {
    private DataSearchService dataSearchService;

    public DataSearchController(DataSearchService dataSearchService) {
        this.dataSearchService = dataSearchService;
    }

    @GetMapping
    public String dataSearch() {
        return dataSearchService.ping();
    }
}
