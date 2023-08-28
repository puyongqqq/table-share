package com.puyong.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LogUtil {

    private static final Logger log = LoggerFactory.getLogger("table-share");

    public static void debugLog(String format, Object... arg) {
        if (log.isDebugEnabled()) {
            log.debug(format, arg);
        }
    }

    public static void infoLog(String format, Object... arg) {
        if (log.isInfoEnabled()) {
            log.info(format, arg);
        }
    }

    public static void warnLog(String format, Object... arg) {
        if (log.isWarnEnabled()) {
            log.warn(format, arg);
        }
    }

    public static void errorLog(String format, Object... arg) {
        if (log.isErrorEnabled()) {
            log.error(format, arg);
        }
    }

}
