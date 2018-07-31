package com.gdufe.common.util;

/**
 * @Author: laichengfeng
 * @Description: 数值格式化
 * @Date: 2018/7/27  16:54
 */
public class StringFormatUtils {
    /**
     * 四舍五入, 格式化数值为digit位
     */
    public static String formatRound(double num, int digit) {
        return String.format("%." + digit + "f", num);
    }

    /**
     * 不四舍五入， 格式化数值为digit位
     */
    public static String formatNoRound(double num, int digit) {
        double adjust = 5.0 / Math.pow(10, digit + 1);
        double ans = num >= 0 ? num - adjust : num + adjust;
        String result = String.format("%." + digit + "f", ans);
        if(ans < 0 && Double.valueOf(result) == 0) {
            result = result.replace("-", "");
        }
        return result;
    }
}
