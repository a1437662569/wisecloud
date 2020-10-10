package com.xxl.common.enums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {
    private String returnCode;
    private String errorMessage;
    private T data;

    public static R set(APICodeMsgEnum apiCodeMsgEnum) {
        return R.builder().returnCode(apiCodeMsgEnum.getCode()).errorMessage(apiCodeMsgEnum.getMsg()).build();
    }

    public R set(APICodeMsgEnum apiCodeMsgEnum, T data) {
        return R.builder().returnCode(apiCodeMsgEnum.getCode()).errorMessage(apiCodeMsgEnum.getMsg()).data(data).build();
    }

    public static R ok() {
        return set(APICodeMsgEnum.SUCCESS);
    }

    public R ok(T data) {
        return set(APICodeMsgEnum.SUCCESS, data);
    }


    public static R error() {
        return set(APICodeMsgEnum.SYSTEM_ERROR);
    }


    public static R fail() {
        return set(APICodeMsgEnum.REQUEST_FAIL);
    }


    public static R paramError() {
        return set(APICodeMsgEnum.PARAM_ERROR);
    }

    public static R configError() {
        return set(APICodeMsgEnum.CONFIG_ERROR);
    }

    public static R noCondition() {
        return set(APICodeMsgEnum.NO_CONDITION);
    }

    public static R notFound() {
        return set(APICodeMsgEnum.NOT_FOUND);
    }

    public static R sysBusy() {
        return set(APICodeMsgEnum.SYS_BUSY);
    }

    public static R notInDateRange() {
        return set(APICodeMsgEnum.NOT_IN_DATE_RANGE);
    }

}
