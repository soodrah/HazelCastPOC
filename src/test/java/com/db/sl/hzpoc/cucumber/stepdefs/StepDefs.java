package com.db.sl.hzpoc.cucumber.stepdefs;

import com.db.sl.hzpoc.HazelCastPocApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HazelCastPocApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
