package com.imooc.gradle.study

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 自定义Plugin
 */
class GradleStudyPlugin implements Plugin<Project> {

    /**
     * 唯一需要实现的就是这个方法
     * @param project 就是引入当前插件的Project对象
     */
    @Override
    void apply(Project project) {
        println '============================> GradleStudyPlugin apply project name: ' + project.name
        //创建扩展属性
        project.extensions.create('imoocReleaseInfo', ReleaseInfoExtension)
        // 创建Task
        project.tasks.create('imoocReleaseInfoTask', ReleaseInfoTask)

    }
}
