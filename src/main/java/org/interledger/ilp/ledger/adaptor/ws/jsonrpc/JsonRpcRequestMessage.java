package org.interledger.ilp.ledger.adaptor.ws.jsonrpc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request message (a method invocation) over JSON-RPC.
 */
public class JsonRpcRequestMessage extends JsonRpcMessage {

  private String method;

  @JsonProperty(value = "method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

}


