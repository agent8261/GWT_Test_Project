package edu.umich.imlc.mydesk.cloud.shared;

import java.util.HashMap;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Section_GWT implements IsSerializable
{
  private Long sectionID;

  private String location;

  private String sectionName;

  private Date_GWT startDate;

  private Date_GWT endDate;

  private Course_GWT course;

  private HashMap<String, String> tagMap = new HashMap<String, String>();

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public Section_GWT(Long sectionID_, Course_GWT course_)
  {
    assert (course_ != null);

    sectionID = sectionID_;
    course = course_;
    startDate = new Date_GWT();
    endDate = new Date_GWT();
  }// ctor

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for Objectify
   */
  @SuppressWarnings("unused")
  private Section_GWT()
  {

  }// ctor

  // ---------------------------------------------------------------------------

  public String getLocation()
  {
    return location;
  }

  // ---------------------------------------------------------------------------

  public void setLocation(String location_)
  {
    location = location_;
  }

  // ---------------------------------------------------------------------------

  public Long getSectionID()
  {
    return sectionID;
  }

  // ---------------------------------------------------------------------------

  public void setSectionName(String sectionName_)
  {
    sectionName = sectionName_;
  }

  // ---------------------------------------------------------------------------

  public String getSectionName()
  {
    return sectionName;
  }

  // ---------------------------------------------------------------------------

  public Course_GWT getCourse()
  {
    return course;
  }

  // ---------------------------------------------------------------------------

  public HashMap<String, String> getTagMap()
  {
    return tagMap;
  }

  // ---------------------------------------------------------------------------

  public Date_GWT getStartDate()
  {
    return startDate;
  }

  // ---------------------------------------------------------------------------

  public void setStartDate(Date_GWT startDate_)
  {
    startDate = startDate_;
  }

  // ---------------------------------------------------------------------------

  public Date_GWT getEndDate()
  {
    return endDate;
  }

  // ---------------------------------------------------------------------------

  public void setEndDate(Date_GWT endDate_)
  {
    endDate = endDate_;
  }
  
  public Long getOrganizationID()
  {
    return course.getOrganization().getOrganizationID();
  }

}// class
