package com.zhangdi.website.enums;

/**
 * Created by hzzhandi3 on 2016/12/11.
 */
public enum DemoEnum {
    ONE,
    TWO,
    THREE;

    DemoEnum(){
        mask = (1 << ordinal());
    }

    public final int mask;

    public final int getMask() {
        return mask;
    }
}
