package com.history.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DockLayout extends DockLayoutPanel
{
  static final String weMapType = "weMap";
  static final String weKWLType = "weKWL";
  static final String weSketchType = "weSketch";
  
  private Label idLabel = new Label("Input file ID:");
  private Label typeLabel = new Label("Select Type:");  
  private TextArea fileIDTextInput = new TextArea();
  private ListBox typeBox = new ListBox();
  private Button btnLoadFile = new Button("Load File");
  
  private HorizontalPanel centerPanel = new HorizontalPanel();
  private HorizontalPanel typeSelectionPanel = new HorizontalPanel();
  private VerticalPanel  westPanel = new VerticalPanel();
  
  public DockLayout()
  {
    super(Unit.PCT);
    setHeight("100%");
    setWidth("100%");
    makeWestPanel();
    addWest(westPanel, 50);
    add(centerPanel);    
  }
  
  void makeWestPanel()
  {
    typeBox.addItem(weMapType, weMapType);
    typeBox.addItem(weKWLType, weKWLType);
    typeBox.addItem(weSketchType, weSketchType);
    typeBox.setVisibleItemCount(1);
    
    westPanel.add(idLabel);
    fileIDTextInput.setCharacterWidth(30);
    fileIDTextInput.setVisibleLines(2);
    westPanel.add(fileIDTextInput);
    westPanel.add(typeLabel);
    
    typeSelectionPanel.add(typeBox);
    typeSelectionPanel.add(btnLoadFile);
    westPanel.add(typeSelectionPanel);
  }

}
