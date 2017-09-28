package com.uber.jenkins.phabricator.differential

import java.util.Date

class Diff {
  var id: String = ""
  var revisionId: String = ""
  var dateCreated: Date? = null
  var dateModified: Date? = null
  var branch: String = ""
  var unitStatus: Int = 0
  var lintStatus: Int = 0

  fun getFormatedRevisionID(): String {
    return "D$revisionId"
  }
}
