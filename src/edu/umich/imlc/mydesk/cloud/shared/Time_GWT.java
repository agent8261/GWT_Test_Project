package edu.umich.imlc.mydesk.cloud.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Time_GWT implements IsSerializable, Comparable<Time_GWT>
{
  private int hours = 0;
  private int minutes = 0;
  private int seconds = 0;
  private int UTC_offset = 0;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------
  public Time_GWT(int hours_, int minutes_, int seconds_, int UTC_offset_)
  {
    this(hours_, minutes_, seconds_);
    UTC_offset = UTC_offset_;
  }// ctor

  // ---------------------------------------------------------------------------

  public Time_GWT(int hours_, int minutes_, int seconds_)
  {
    hours = hours_;
    minutes = minutes_;
    seconds = seconds_;
  }// ctor

  // ---------------------------------------------------------------------------

  @SuppressWarnings("unused")
  private Time_GWT()
  {
  }

  // ---------------------------------------------------------------------------

  public int getHours()
  {
    return hours;
  }

  // ---------------------------------------------------------------------------

  public void setHours(int hours_)
  {
    hours = hours_;
  }

  // ---------------------------------------------------------------------------

  public int getMinutes()
  {
    return minutes;
  }

  // ---------------------------------------------------------------------------

  public void setMinutes(int minutes_)
  {
    minutes = minutes_;
  }

  // ---------------------------------------------------------------------------

  public int getSeconds()
  {
    return seconds;
  }

  // ---------------------------------------------------------------------------

  public void setSeconds(int seconds_)
  {
    seconds = seconds_;
  }

  // ---------------------------------------------------------------------------

  public int getUTC_offset()
  {
    return UTC_offset;
  }

  // ---------------------------------------------------------------------------

  public void setUTC_offset(int UTC_offset_)
  {
    UTC_offset = UTC_offset_;
  }

  // ---------------------------------------------------------------------------
  
  @Override
  public int compareTo(Time_GWT obj)
  {
    int uHr = hours + UTC_offset;
    int oUhr = obj.hours + obj.UTC_offset;
    
    if(uHr > oUhr)
      return 1;
    
    if(uHr < oUhr)
      return -1;
    
    assert(uHr == oUhr);
    
    if(minutes > obj.minutes)
      return 1;
    
    if(minutes < obj.minutes)
      return -1;
    
    assert(minutes == obj.minutes);
    
    if(seconds > obj.seconds)
      return 1;
    
    if(seconds < obj.seconds)
      return -1;
          
    assert(seconds == obj.seconds);
      
    return 0;
  }

  // ---------------------------------------------------------------------------

}// class
