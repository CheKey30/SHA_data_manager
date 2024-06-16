package org.sha.sha_data_manager.dto;

import lombok.Data;

import java.util.List;

@Data
public class ShaPagedResponse<T> {
    List<T> data;
    int code;
    String message;
    int page;
    int size;

    public ShaPagedResponse(int code, String msg, List<T> data, int page, int size) {
        this.code = code;
        this.message = msg;
        this.data = data;
        this.page = page;
        this.size = size;
    }

    public static <T> ShaPagedResponse<T> success(List<T> data, int page, int size) {
        ShaPagedResponse item = new ShaPagedResponse(200, "success", data, page, size);
        return item;
    }

    public static ShaPagedResponse failure(int errCode, String errorMessage) {
        ShaPagedResponse item = new ShaPagedResponse(errCode, errorMessage, null, 0, 0);
        return item;
    }
}
