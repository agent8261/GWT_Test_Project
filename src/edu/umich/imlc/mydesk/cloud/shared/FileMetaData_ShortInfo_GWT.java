package edu.umich.imlc.mydesk.cloud.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class FileMetaData_ShortInfo_GWT implements IsSerializable
{
  private String fileID;
  private String fileName;
  private String fileType;
  private long sequenceNumber;

  // ---------------------------------------------------------------------------
  // ---------------------------------------------------------------------------

  public FileMetaData_ShortInfo_GWT(String fileID_, String fileName_,
      String fileType_, long sequenceNumber_)
  {
    fileID = fileID_;
    fileName = fileName_;
    fileType = fileType_;
    sequenceNumber = sequenceNumber_;
  }

  // ---------------------------------------------------------------------------

  /**
   * No-arg ctor for serialization
   */
  @SuppressWarnings("unused")
  private FileMetaData_ShortInfo_GWT()
  {
    sequenceNumber = -1;
  }

  // ---------------------------------------------------------------------------

  public String getFileID()
  {
    return fileID;
  }

  // ---------------------------------------------------------------------------

  public String getFileName()
  {
    return fileName;
  }

  // ---------------------------------------------------------------------------

  public String getFileType()
  {
    return fileType;
  }

  // ---------------------------------------------------------------------------

  public long getSequenceNumber()
  {
    return sequenceNumber;
  }

  // ---------------------------------------------------------------------------

}// class
