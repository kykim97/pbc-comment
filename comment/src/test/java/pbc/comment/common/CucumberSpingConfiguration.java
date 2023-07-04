package pbc.comment.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pbc.comment.CommentApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CommentApplication.class })
public class CucumberSpingConfiguration {}
