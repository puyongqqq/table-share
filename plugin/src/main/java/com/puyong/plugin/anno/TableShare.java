package com.puyong.plugin.anno;

import com.puyong.plugin.strategy.AbstractTableShareStrategy;
import com.puyong.plugin.strategy.BasedMonthTableShareStrategy;

import java.lang.annotation.*;

/**
 * 分表注解，作用于Mapper上
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Inherited
@interface TableShare {

    /**
     * 分表策略
     */
    Class<? extends AbstractTableShareStrategy> strategy() default BasedMonthTableShareStrategy.class;
}
