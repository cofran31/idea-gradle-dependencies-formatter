package com.github.platan.idea.dependencies.sort

import com.intellij.testFramework.LightCodeInsightTestCase

class SortDependenciesTest extends LightCodeInsightTestCase {

    @Override
    protected String getTestDataPath() {
        'src/test/resources/actions/sort/'
    }

    void test__already_sorted() {
        doTest()
    }

    void test__simple() {
        doTest()
    }

    void test__ignore_quotation_mark() {
        doTest()
    }

    void test__by_configuration_name() {
        doTest()
    }

    void test__with_comments() {
        doTest()
    }

    void test__remove_empty_lines() {
        doTest()
    }

    void test__with_closure() {
        doTest()
    }

    void test__with_variable() {
        doTest()
    }

    void test__with_method() {
        doTest()
    }

    void test__map_notation() {
        doTest()
    }

    void test__with_quotation_mark() {
        doTest()
    }

    void test__with_escaped_characters() {
        doTest()
    }

    void test__dependency_list() {
        doTest()
    }

    private doTest() {
        def fileName = getTestName(false).replaceFirst('__', '')
        configureByFile("${fileName}.gradle")
        SortDependenciesAction action = new SortDependenciesAction()
        action.handler.invoke(project, editor, file)
        checkResultByFile("${fileName}_after.gradle")
    }

}
