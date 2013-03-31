package com.history.server;

import com.history.client.RPCService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class RPCServiceImpl extends RemoteServiceServlet implements
    RPCService
{

  public String greetServer(String input) throws IllegalArgumentException
  {
    return null;
  }
}
