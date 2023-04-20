package com.akto.dto.test_editor;

import com.akto.dto.OriginalHttpResponse;
import com.akto.dto.RawApi;

public class ExecutionResult {
    
    private Boolean success;
    private String errMsg;
    private RawApi request;
    private OriginalHttpResponse response;

    public ExecutionResult(Boolean success, String errMsg, RawApi request, OriginalHttpResponse response) {
        this.success = success;
        this.errMsg = errMsg;
        this.request = request;
        this.response = response;
    }

    public ExecutionResult() { }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
    
    public RawApi getRequest() {
        return request;
    }

    public void setRequest(RawApi request) {
        this.request = request;
    }

    public OriginalHttpResponse getResponse() {
        return response;
    }

    public void setResponse(OriginalHttpResponse response) {
        this.response = response;
    }
    
}
