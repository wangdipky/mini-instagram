package com.vn.vang.basecommon.utils;

import lombok.SneakyThrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * CreatedDate: 09/03/2025
 * UpdatedDate:
 * Version: 1.0
 * Author: Quang
 * Name: DateUtilsCommon
 */
public class DateUtilsCommon {

    public static final String DD_MM_YYYY = "yyyy-MM-dd";

    public static final String DD_MM_YYYY_HH_MM = "yyyy-MM-dd HH:mm:ss";

    public static final String MM_YYYY = "MM-yyyy";

    /**
     * This function uses getting full of format dd-mm-yyyy hh:mm:ss date
     * @return {{@link Date}}
     */
    @SneakyThrows
    public Date getSystemDateTime() {

        SimpleDateFormat dateFormat = new SimpleDateFormat(DD_MM_YYYY_HH_MM);
        return dateFormat.parse(new Date().toString());
    }
}