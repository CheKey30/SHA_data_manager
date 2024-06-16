package org.sha.sha_data_manager.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BilibiliVideoInfo {
    long id;
    String videoName;
    Timestamp record_time;
    String view_count;

}
