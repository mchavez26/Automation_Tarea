package com.nearsoft.schools.automation.pages.behaviors.filters;

public interface IFilterBehavior {
    void selectFilter(String category, String option);
    boolean isFilterSelected(String category, String option);
}
