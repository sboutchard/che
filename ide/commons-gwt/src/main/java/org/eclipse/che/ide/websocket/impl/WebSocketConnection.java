/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.websocket.impl;

/**
 * This interface is purposed to split WEB SOCKET API and implementations, that is needed because
 * here we are wrapping native implementations which potentially may require switching to some
 * javascript library.
 *
 * @author Dmitry Kuleshov
 */
public interface WebSocketConnection {

  /** Open a WEB SOCKET connection */
  void open();

  /** Close a WEB SOCKET connection */
  void close();

  /**
   * Send a text message over WEB SOCKET
   *
   * @param message text message to send
   */
  void send(final String message);

  /**
   * Checks if WEB SOCKET connection is closed
   *
   * @return <code>true</code> if closed
   */
  boolean isClosed();

  /**
   * Checks if WEB SOCKET connection is closing
   *
   * @return <code>true</code> if closing
   */
  boolean isClosing();

  /**
   * Checks if WEB SOCKET connection is open
   *
   * @return <code>true</code> if open
   */
  boolean isOpen();

  /**
   * Checks if WEB SOCKET connection is connecting
   *
   * @return <code>true</code> if connecting
   */
  boolean isConnecting();
}
