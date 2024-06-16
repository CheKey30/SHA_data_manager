package org.sha.sha_data_manager.dto;

import lombok.Data;

@Data
public class ShaResponse<T> {
    private T data;
    private int code;
    private String message;

    public ShaResponse(int code, String msg, T data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }

    public static <T> ShaResponse<T> success(T data) {
        ShaResponse item = new ShaResponse(200, "success", data);
        return item;
    }

    public static ShaResponse failure(int errCode, String errorMessage) {
        ShaResponse item = new ShaResponse(errCode, errorMessage, null);
        return item;
    }
}
