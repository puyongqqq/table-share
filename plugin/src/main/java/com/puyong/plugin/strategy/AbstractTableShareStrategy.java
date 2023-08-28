package com.puyong.plugin.strategy;

import java.util.function.Function;

/**
 * 分表策略
 */
public abstract class AbstractTableShareStrategy {

    /**
     * 分表键
     */
    public abstract String tableSuffix(String key);

}
