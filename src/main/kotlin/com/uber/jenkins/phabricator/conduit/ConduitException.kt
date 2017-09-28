package com.uber.jenkins.phabricator.conduit

class ConduitException : Exception {
  val code: Int

  constructor(message: String) : super(message) {
    this.code = 0
  }

  constructor(message: String, code: Int) : super(message) {
    this.code = code
  }
}
