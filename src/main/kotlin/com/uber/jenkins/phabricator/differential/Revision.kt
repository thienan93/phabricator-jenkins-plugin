package com.uber.jenkins.phabricator.differential

import java.util.Date

class Revision(var id: String, var phid: String) {
  var title: String = ""
  var uri: String = ""
  var dateCreated: Date? = null
  var dateModified: Date? = null
  var authorPHID: String = ""
  var status: Int = 0
  var statusName: String = ""
  var branch: String = ""
}
