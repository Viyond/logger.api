package com.taobao.middleware.logger;

/**
 * 阿里中间件日志级别
 * 
 */
public enum Level {
    DEBUG("DEBUG"), INFO("INFO"), WARN("WARN"), ERROR("ERROR"), OFF("OFF");

    private String name;

    Level(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Level codeOf(String level) {
        for (Level l : Level.values()) {
            if (l.name.equals(level)) {
                return l;
            }
        }

        return OFF;
    }
}
