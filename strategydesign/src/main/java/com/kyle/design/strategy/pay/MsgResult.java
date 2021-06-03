package com.kyle.design.strategy.pay;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-06-03 23:01
 * @description :
 */
public class MsgResult {

    private final int codeStatus;
    private final Object info;
    private final String msg;

    public MsgResult(int codeStatus, Object info, String msg) {
        this.codeStatus = codeStatus;
        this.info = info;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "codeStatus=" + codeStatus +
                ", info=" + info +
                ", msg='" + msg + '\'' +
                '}';
    }
}
