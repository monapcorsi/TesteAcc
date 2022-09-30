package tricentis.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		features = { "classpath:features" },
		glue = { "tricentis.vehicle.steps" }, 
		tags = { "@CriarCotacaoSeguroAutomotivo" })

public class Runner {
	
}
