package com.puyong.plugin.strategy;

import com.puyong.common.util.LogUtil;

/**
 * 基于月份的分表策略
 * @author puyong
 */
public class BasedMonthTableShareStrategy extends AbstractTableShareStrategy {

    @Override
    public String tableSuffix(String key) {
        // check key 是否合法
        if (key == null || key.length() < 14) {
            throw new IllegalArgumentException("key is invalid");
        }
        // 获取key中的时间
        final var tableSuffix = key.substring(6, 10);
        LogUtil.infoLog("tableSuffix|", tableSuffix);
        if (!preCheck(tableSuffix)) {
            throw new IllegalArgumentException("");
        }
        // 构建表后缀
        return tableSuffix;
    }

    private boolean preCheck(String tableSuffix) {
        // check suffix
        return true;
    }

}
