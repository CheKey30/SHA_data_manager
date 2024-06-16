package org.sha.sha_data_manager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class BilibiliVideoInfo {
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    private String videoName;
    private Timestamp record_time;
    private String view_count;

}
