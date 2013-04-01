package edu.umich.imlc.mydesk.cloud.shared;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Date_GWT implements IsSerializable, Comparable<Date_GWT>
{
  private int year;
  private int month;
  private int day;
  private final Time_GWT time;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------
  @SuppressWarnings("deprecation")
  public Date_GWT(int year_, int month_, int day_)
  {
    Date d = new Date();
    time = new Time_GWT(d.getHours(), d.getMinutes(), d.getSeconds(), d.getTimezoneOffset());
    year = year_;
    month = month_;
    day = day_;
  }// ctor

  // ---------------------------------------------------------------------------

  public Date_GWT(int year_, int month_, int day_, Time_GWT time_)
  {
    year = year_;
    month = month_;
    day = day_;
    time = time_;
  }// ctor
  
  // ---------------------------------------------------------------------------
  
  @SuppressWarnings("deprecation")
  public Date_GWT()
  {
    Date d = new Date();
    time = new Time_GWT(d.getHours(), d.getMinutes(), d.getSeconds(), d.getTimezoneOffset());
    year = d.getYear();
    month = d.getMonth() + 1; // NOTE: Need the +1 because 0-11.
    day = d.getDate();
  }

  
  // ---------------------------------------------------------------------------

  public int getYear()
  {
    return year;
  }

  // ---------------------------------------------------------------------------

  public void setYear(int year_)
  {
    year = year_;
  }

  // ---------------------------------------------------------------------------

  public int getMonth()
  {
    return month;
  }

  // ---------------------------------------------------------------------------

  public String getMonthAsString()
  {
    switch ( month )
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "MONTH_NOT_SET";
    }// switch

  }// getMonthAsString

  // ---------------------------------------------------------------------------

  public void setMonth(int month_)
  {
    month = month_;
  }

  // ---------------------------------------------------------------------------

  public int getDay()
  {
    return day;
  }

  // ---------------------------------------------------------------------------

  public void setDay(int day_)
  {
    day = day_;
  }

  // ---------------------------------------------------------------------------

  public Time_GWT getTime()
  {
    return time;
  }

  // ---------------------------------------------------------------------------

  public void setTime(Time_GWT time_)
  {
    time.setHours(time_.getHours());
    time.setMinutes(time_.getMinutes());
    time.setSeconds(time_.getSeconds());
    time.setUTC_offset(time_.getUTC_offset());
  }

  // ---------------------------------------------------------------------------

  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append(year);
    builder.append('-');
    builder.append(getMonthAsString());
    builder.append('-');
    builder.append(day);
    return builder.toString();
  }

  // ---------------------------------------------------------------------------
  
  /**
   * returns
   * return 1  if this is more recent then obj
   * return 0  if this is the same
   * return -1 if this is older then obj
   */
  @Override
  public int compareTo(Date_GWT obj)
  {
    if(year > obj.year)
      return 1;
    
    if(year < obj.year)
      return -1;
    
    assert(year == obj.year);
    
    if(month > obj.month)
      return 1;
    
    if(month < obj.month)
      return -1;
    
    assert(month == obj.month);
    
    if(day > obj.day)
      return 1;
    
    if(day < obj.day)
      return -1;
    
    assert(day == obj.day);
    
    return time.compareTo(obj.time);
  }

  // ---------------------------------------------------------------------------

}// class
