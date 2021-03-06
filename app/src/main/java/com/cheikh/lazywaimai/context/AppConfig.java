package com.cheikh.lazywaimai.context;

import java.io.File;
import com.cheikh.lazywaimai.BuildConfig;
import com.cheikh.lazywaimai.util.SDCardUtil;

public class AppConfig {

    /**
     * 是否是debug模式
     */
    public static final boolean DEBUG = BuildConfig.DEBUG;

    /**
     * 服务器地址
     */
    public static final String SERVER_URL = "http://47.94.252.84:8082/v1/";

    /**
     * 连接超时时间
     */
    public static final int CONNECT_TIMEOUT_MILLIS = 15 * 1000; // 15s

    /**
     * 响应超时时间
     */
    public static final int READ_TIMEOUT_MILLIS = 20 * 1000; // 20s

    /**
     * App ID
     */
    public static final String APP_KEY = "android";

    /**
     * App Secret
     */
    public static final String APP_SECRET = "afegewlnbnl987nfelwn";

    public static final String APP_NAME = "lazy_waimai";

    public static String getAppRootPath() {
        return SDCardUtil.getRootPath() + File.separator + APP_NAME;
    }

    public static String getAppImagePath() {
        return getAppRootPath() + File.separator + "image";
    }
}
