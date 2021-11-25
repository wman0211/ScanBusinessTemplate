package com.github.wman0211.scanbusinesstemplate.services

import com.intellij.openapi.project.Project
import com.github.wman0211.scanbusinesstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
