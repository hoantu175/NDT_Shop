/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comon.utilities;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenth28
 */
public class DateTimeUtil {
    public static Date stringToDate(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        try {
            return formatter.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(DateTimeUtil.class.getName()).log(Level.SEVERE, null, ex);
            return new Date();
        }
    }

    public static Long convertDateToTimeStampSecond() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    
    public static Long convertDateToTimeStampSecond(Date date) {
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp.getTime();
    }
}
